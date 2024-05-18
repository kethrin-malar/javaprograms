package collection;

import java.util.HashSet;

/*
Adds the specified element to the HashSet.
HashSet Add method is implemented from Collection interface and overridden from AbstractCollection.
*/
public class Hashsetsample{
public static void main(String[] args) 
{

	
	
	HashSet hs =new HashSet();
	hs.add(20);
	hs.add(74.10f);
	hs.add("Java");
	hs.add(90);
	hs.add(100);
	hs.add("Programs");
	
	
	boolean a=hs.contains(20);
	System.out.println(a);
  
	
	System.out.println(hs);
	
	hs.remove(100);
	System.out.println(hs);
	

	
	
	
	
}
}
