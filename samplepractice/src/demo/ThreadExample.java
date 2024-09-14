package demo;

class PrintNumber extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hi:"+ i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}





public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
