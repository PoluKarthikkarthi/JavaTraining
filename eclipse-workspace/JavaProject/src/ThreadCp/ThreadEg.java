package ThreadCp;

//class MainClass extends Thread{  thread
class MainClass	implements Runnable{ //multithread
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

public class ThreadEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before object called ");
//		MainClass mc = new MainClass();
//		mc.start();

		MainClass ta = new MainClass();
		Thread t = new Thread(ta);
		t.start();
	}

}
