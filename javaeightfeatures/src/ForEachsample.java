import java.util.Arrays;
import java.util.List;

public class ForEachsample {
public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);

		list.forEach(k -> System.out.println("Printing the elements in the list : "+k)); // iterate the list using forEach method, this forEach method is available since java 1.8
}
}
