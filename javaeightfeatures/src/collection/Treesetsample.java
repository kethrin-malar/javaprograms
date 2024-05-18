package collection;

import java.util.TreeSet;

/*
Adds the specified element to the TreeSet.
TreeSet Add method is implemented from Collection interface and overridden from AbstractCollection.
*/


public class Treesetsample {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(256);
		t.add(87);
		t.add(167);
		t.add(60);
		//t.add(60);

		System.out.println(t);
		
		
		Integer a=t.first();
	    System.out.println(a);


	}
}
