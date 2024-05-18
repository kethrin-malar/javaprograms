package collection;

import java.util.ArrayList;

/*
  Removes all of the elements from ArrayList. The list will be empty after calling clear method.
  ArrayList clear method has been implemented from Collection interface and overridden from AbstractList.
 */
public class ArrayListsample 
{
public static void main(String[] args) 
{
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(23);
	al.add(47);
	al.add(72);
	al.add(10);
	al.add(7);
	al.add(92);
	al.add(58);
	al.add(69);
	al.add(92);   
	
	System.out.println(al);
	
	int a=al.indexOf(72);
	System.out.println(a);
	

	
	al.clear();
	System.out.println(al);

	
	
	
	
	
}
}
