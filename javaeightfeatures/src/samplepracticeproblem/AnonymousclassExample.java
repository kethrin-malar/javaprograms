package samplepracticeproblem;

abstract class Sample {
	abstract void run();
}

public class AnonymousclassExample {
	public static void main(String[] args) {
		Sample obj = new Sample() {
			void run() {
				System.out.println(" Run fast....");

			}
		};
		obj.run();
	}

}
