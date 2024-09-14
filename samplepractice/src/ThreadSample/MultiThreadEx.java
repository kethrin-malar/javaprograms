package ThreadSample;

class School extends Thread {
	public void run() {
		for (int i = 0; i <= 25; i++) {
			System.out.println("Hi:" + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("caught error:" + e.getMessage());
			}
		}
	}
}

class Teacher extends Thread {
	public void run() {
		for (int i = 0; i <= 25; i++) {
			System.out.println("Hello:" + i);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("caught error:" + e.getMessage());
			}
		}
	}
}

public class MultiThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School obj = new School();
		Teacher obj1 = new Teacher();

		obj.start();
		obj1.start();
	}

}
