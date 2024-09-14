package ThreadSample;

public class ThreadImpl implements Runnable {
	public void run() {
		System.out.println("Hello");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadImpl t = new ThreadImpl();
		Thread obj = new Thread(t);
		obj.start();
	}

}
