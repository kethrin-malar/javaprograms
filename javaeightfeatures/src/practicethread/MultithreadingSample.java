package practicethread;

class Example extends Thread {
	public void run() {
		for (int i = 0; i <= 11; i++) {
			System.out.println("hi :" +i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}

	}
}

class Example1 extends Thread {
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println("hello:" +i);
			try {
				Thread.sleep(1000);
				
			}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

public class MultithreadingSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj = new Example();
		Example1 obj1 = new Example1();
		obj.start();
		obj1.start();
	}

}
