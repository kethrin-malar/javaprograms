package streamconcept;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//intermediate operation
   List<Integer> number = Arrays.asList(1,2,3,4,10,5,6,8,9);
    List<Integer> evenNumber = number.stream()
    		.filter(n ->n%2==0)
    		.collect(Collectors.toList());
    System.out.println(evenNumber);
	
	
	
	List<String> names = Arrays.asList("Malar","John","Venkat");
	List<String> upperCase = names.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
	System.out.println(upperCase);
	
	
	List<List<Integer>> num =Arrays.asList(
			Arrays.asList(1,2,3),
			Arrays.asList(5,6,7));
	List<Integer> numbers =num.stream()
			.flatMap(List::stream)
			.collect(Collectors.toList());
	System.out.println(numbers);
	
	List<Integer> nums = Arrays.asList(1,2,3,8,5,6,7);
	List<Integer> sortedList =nums.stream()
			.sorted()
			.collect(Collectors.toList());;
			System.out.println(sortedList);
			
			List<Integer> nums1 = Arrays.asList(1,2,3,8,5,6,7);
			List<Integer> limit =nums1.stream()
					.limit(4)
					.collect(Collectors.toList());;
					System.out.println(limit);
			
	
			List<Integer> nums2 = Arrays.asList(1,2,3,8,5,6,7);
			List<Integer> skip =nums2.stream()
					.skip(8)
					.collect(Collectors.toList());;
					System.out.println(sortedList);
			
					List<Integer> n = Arrays.asList(1,2,3,8,8,1,3,5,6,7);
					List<Integer> distinct =n.stream()
							.distinct()
							.collect(Collectors.toList());;
							System.out.println(distinct);
							
	//short-circuiting operation anyMatch,allMatch,noneMatch,findAll,findAny
  List<Integer> n1 = Arrays.asList(1,2,6,7,9,8);
  Boolean Matched =n1.stream().anyMatch(v -> v % 2 == 0);
		  System.out.println(Matched);
		  
		  List<Integer>n2 =Arrays.asList(2,4,6,7);
		  Boolean hasEven = n2.stream().allMatch(v1->v1%2==0);
		  System.out.println(hasEven);
		  
		  List<Integer>n3=Arrays.asList(1,3,5,7);
		  Boolean hasNumber = n3.stream().noneMatch(v3->v3%2==0);
		  System.out.println(hasNumber);
		  
		  List<Integer> n4 = Arrays.asList(1,2,3,4,5,6);
		  Optional<Integer> any =n4.stream().findAny();
		  any.ifPresent(System.out::println);
		  
		  List<Integer> n5 = Arrays.asList(1,2,3,4,5,6);
		  Optional<Integer> all = n5.stream().findFirst();
		  all.ifPresent(System.out::println);
		  
		  List<String> n6 = Arrays.asList("malr","reena");
		  n6.stream().forEach(System.out::println);
		  
		  List<String> n7 = Arrays.asList("malr","reena","varru");
		  List<String> collect =n6.stream().collect(Collectors.toList());
		  System.out.println(collect);
		  
		  
		  

		  
		  List<Integer> n8 = Arrays.asList(6,7,1);
		  Optional<Integer> minNumber = n8.stream().min(Integer::compareTo);
		  minNumber.ifPresent(System.out::println);
		  
		  List<Integer> n9 = Arrays.asList(9,0,2,6);
		  Optional<Integer> maxNumber =n9.stream().max(Integer::compareTo);
		  maxNumber.ifPresent(System.out::println);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 

  
							
					
	
}
		
		
}

