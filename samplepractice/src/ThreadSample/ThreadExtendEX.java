package ThreadSample;

class ThreadExtendEX extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		ThreadExtendEX t1 = new ThreadExtendEX();
		t1.start();
	}
}
