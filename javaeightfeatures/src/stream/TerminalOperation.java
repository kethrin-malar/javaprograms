package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation {

	public static void main(String[] args) {
		//forEach(): Performs an action for each element in the stream.
		List<String> names = Arrays.asList("John", "Alice", "Bob");
		names.stream().forEach(System.out::println); 
		
		
		//collect(): Collects elements into a collection using a collector.
		List<String> name = Arrays.asList("John", "Alice", "Bob");
		List<String> collectedNames = name.stream().collect(Collectors.toList());
		System.out.println(collectedNames);


        //anyMatch(): Checks if any element matches a predicate.
		List<Integer> numbers = Arrays.asList(1, 7, 3, 9, 5);
		boolean hasEvenNumber = numbers.stream().anyMatch(n -> n % 2 == 0);
		System.out.println(hasEvenNumber);
		
		//findAny(): Finds any element in the stream.
		List<String> nam = Arrays.asList("John", "Alice", "Bob");
		Optional<String> any = nam.stream().findAny();
		any.ifPresent(System.out::println); 


	}

}
