package ThreadCp;

class JoinThread implements Runnable{
	Thread t;
	 
	JoinThread() {
		t = new Thread(this, "JoinThread");
		System.out.println("thread create:" + t);
		t.start();
	}
	
	public void run(){
		try {
			for(int i = 0; i<5; i++) {
				Thread.sleep(1000);
				System.out.println("i = " + i); 
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  System.out.println("after object called ");
	}
}

public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Join j = new Join(); 
		JoinThread jt = new JoinThread();
		System.out.println("Main method Started");
		System.out.println(jt.t + "is alive ? : " + jt.t.isAlive());
		try {
			System.out.println("Main thread waiting for JoinThread to finish");
			jt.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread is interrupted");
		}
		System.out.println(jt.t + "is alive ? : " + jt.t.isAlive());
		System.out.println("Main Thread is exiting");

	}

}
