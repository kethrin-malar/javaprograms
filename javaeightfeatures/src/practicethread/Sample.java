package practicethread;

public class Sample extends Thread {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		obj.start();
		System.out.println("run inside thread");	

	}
	public void run() {
		System.out.println("run outside thread");	
		}
	

}
