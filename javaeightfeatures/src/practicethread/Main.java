package practicethread;

public class Main extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main thread = new Main();
		thread.start();
		System.out.println("inside thread");
	}

	public void run() {
		System.out.println("outside thread");
	}

}
