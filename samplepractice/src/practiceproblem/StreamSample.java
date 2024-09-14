package practiceproblem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//filter,map,flatmap,skip,limit,distinct
		
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> EvenNumber = number.stream()
				.filter(n->n%2==0)
				.collect(Collectors.toList());
		System.out.println(EvenNumber);
		
		
		List<String> names = Arrays.asList("malar","varrun","reena");
		List<String> uppercase = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(uppercase);
		
		List<List<Integer>> num = Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6),
				Arrays.asList(7,8,9));
		
		List<Integer> flatmap = num.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(flatmap);
		
		
		List<Integer> n1 = Arrays.asList(10,2,8,4,10,6,7,8,9,10);
		List<Integer> distinctnumber = n1.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(distinctnumber);
		
		List<Integer> n2 = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> skip = n2.stream()
				.skip(5)
				.collect(Collectors.toList());
		System.out.println(skip);
		
		
		List<Integer> n3 = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> limit = n3.stream()
				.limit(5)
				.collect(Collectors.toList());
		System.out.println(limit);
		
		List<Integer> n4 = Arrays.asList(1,2,9,4,5,10,7,8);
		List<Integer> sort= n4.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(sort);
		
		
	}

}
