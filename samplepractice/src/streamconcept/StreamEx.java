package streamconcept;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> obj = Arrays.asList(1,2,3,4,5,6);
		List<Integer>EvenNumber =obj.stream().filter(n->n%2==0)
				.collect(Collectors.toList());
		System.out.println(EvenNumber);
		
		List<String> obj1 =Arrays.asList("malr","reena","varrun");
		List<String> uppercase = obj1.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(uppercase);
		
		List<Integer> obj2 = Arrays.asList(1,2,3,4,5);
		Optional<Integer> min = obj2.stream().min(Integer::compareTo);
		min.ifPresent(System.out::println);
		
		
		List<Integer> obj3 = Arrays.asList(1,2,3,4,5,6);
		Optional<Integer>any = obj3.stream().findAny();
		any.ifPresent(System.out::println);
		
		List<Integer> obj4 = Arrays.asList(1,2,3,4,5,6);
		Boolean allmatch = obj4.stream()
				.allMatch(n->n%2==0);
		System.out.println(allmatch);
		
		
		List<Integer> obj5 = Arrays.asList(1,2,3,4,5,6);
		obj5.stream().forEach(System.out::println);
		

	}

}
