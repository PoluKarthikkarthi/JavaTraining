package ThreadCp;

class FirestClass{
	int num;
	boolean available=false;
	public synchronized int put(int num) {
		if(available)
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}		
		
		this.num=num;
		
		String name = Thread.currentThread().getName();
		System.out.println(name+ " produces " +  num);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		available=true;
		notify();
		return num;
		
	}

	public synchronized int get() {
		if(!available)
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}	
		String name = Thread.currentThread().getName();
		System.out.println(name+ " consumes " +  num);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		available=false;
		notify();
			
		return num;
	}
}
class Producer implements Runnable{
	FirestClass fc;
	public Producer(FirestClass fc2) {
		this.fc = fc2;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		int x = 1, i = 1;
		while (x < 10) {
		
			fc.put(i++);
			x++;
		}
	}
}
class Consumer implements Runnable{
	FirestClass fc;
	public Consumer(FirestClass fc2) {
		this.fc = fc2;
		new Thread(this, "Consumer").start();
	}
	@Override
	public void run() {
			int x = 1;
			while (x < 10) {
				
				fc.get();
				x++;
			}

		
	}
}

public class ProducerAndConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirestClass fc = new FirestClass();
		new Producer(fc);
		new Consumer(fc);
	}

}
