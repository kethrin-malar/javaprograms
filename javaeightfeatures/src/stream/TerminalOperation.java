package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperation {

	public static void main(String[] args) {
		//forEach(): Performs an action for each element in the stream.
		List<String> names = Arrays.asList("John", "Alice", "Bob");
		names.stream().forEach(System.out::println); 
		
		
		//collect(): Collects elements into a collection using a collector.
		List<String> name = Arrays.asList("John", "Alice", "Bob");
		List<String> collectedNames = name.stream().collect(Collectors.toList());
		System.out.println(collectedNames); // Output: [John, Alice, Bob]


	}

}
