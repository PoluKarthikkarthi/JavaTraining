package ThreadCp;

class ThreadEx {
	public void printStatement(){
		synchronized(this) {
			try {
				for(int i = 0; i<5; i++) {
					Thread.sleep(1000);
					System.out.println("i = " + i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	System.out.println("after object called ");
	}
}

class ThreadEx2 extends Thread{
	ThreadEx t1;
	
	public ThreadEx2(ThreadEx t12) {
		System.out.println("constructor");
		this.t1 = t12;
	}

	public void run() {
		t1.printStatement();
	}
	
}

public class blockAndUnblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before object called");
		ThreadEx t1 = new ThreadEx();
		ThreadEx2 t2 = new ThreadEx2(t1);
		ThreadEx2 t3 = new ThreadEx2(t1);
		t2.start();
		t3.start();
		System.out.println("end");
	}

}
