package basicprogram;

public class BreakExample {
	public static void main(String[] args) {
		// using for loop
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// breaking the loop
				break;
				
				// continue the loop
				//continue;
			}
			System.out.println(i);
		}
	}
}
