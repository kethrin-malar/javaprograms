package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ShortCircuitingOperation {

	public static void main(String[] args) {

		// allMatch(): Checks if all elements match a given predicate.
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
		boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
		System.out.println(allEven);

		// noneMatch(): Checks if no elements match a given predicate
		List<Integer> number = Arrays.asList(1, 3, 5, 7, 9);
		boolean noneEven = number.stream().noneMatch(n -> n % 2 == 0);
		System.out.println(noneEven);

		// findFirst(): Returns the first element of the stream, if present.
		List<String> names = Arrays.asList("John", "Alice", "Bob");
		Optional<String> first = names.stream().findFirst();
		first.ifPresent(System.out::println);

		// findAny(): Returns any element of the stream, if present.
		List<String> name1 = Arrays.asList("Alice", "Bob");
		Optional<String> any = name1.stream().findAny();
		any.ifPresent(System.out::println);

	}

}
