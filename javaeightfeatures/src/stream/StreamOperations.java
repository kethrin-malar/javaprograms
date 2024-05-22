package stream;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {
		
		// filter(): Filters elements based on a predicate.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Filtered (even numbers): " + evenNumbers); 

        // map(): Transforms elements using a mapping function.
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        List<String> upperCaseNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println("Mapped (uppercase names): " + upperCaseNames);
        
        // flatMap(): Transforms each element into a stream and then flattens the streams into a single stream.
        List<List<Integer>> nestedNumbers = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );
        List<Integer> flattenedNumbers = nestedNumbers.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
        System.out.println("FlatMapped (flattened numbers): " + flattenedNumbers);
        
        // distinct(): Removes duplicate elements.
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5);
        List<Integer> distinctNumbers = numbersWithDuplicates.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Distinct: " + distinctNumbers); 
        
        // sorted(): Sorts elements in natural order.
        List<Integer> unsortedNumbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
        List<Integer> sortedNumbers = unsortedNumbers.stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Sorted: " + sortedNumbers); 
        
        // limit(): Limits the number of elements in the stream.
        List<Integer> limitedNumbers = numbers.stream()
            .limit(5)
            .collect(Collectors.toList());
        System.out.println("Limited: " + limitedNumbers);
        
        // skip(): Skips the first n elements of the stream.
        List<Integer> skippedNumbers = numbers.stream()
            .skip(5)
            .collect(Collectors.toList());
        System.out.println("Skipped: " + skippedNumbers); 
    

	}

}
