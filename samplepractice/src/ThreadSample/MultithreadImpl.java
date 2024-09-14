package ThreadSample;


class Square implements Runnable{
public void run() {
		for(int i=0;i<25;i++) {
			System.out.println("Hi Square:"+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Result:"+e.getMessage());
		}
		}
		
	}
	
}

class Rectangle implements Runnable{
public void run() {
		for(int i=0;i<25;i++) {
			System.out.println("Hi Rectangle:"+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Result:"+e.getMessage());
		}
		}
		
	}
	
}
public class MultithreadImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		Thread t1=new Thread(s);
		Rectangle r = new Rectangle();
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
		

	}

}
