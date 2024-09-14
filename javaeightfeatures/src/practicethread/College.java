package practicethread;

public class College implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College obj = new College();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("Hi i am inside a thread");
	}
    public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello i am outside a thread");
	}

	
}
