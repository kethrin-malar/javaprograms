package collection;


import java.util.LinkedHashMap;
/*
 Removes all of the mappings from LinkedHashMap.The Map will be Empty after calling this method.
 LinkedHashMap clear method has been implemented from Map interface and overridden from HashMap.  
*/
public class LinkedHashMapsample 
{
public static void main(String[] args) 
{
 
	LinkedHashMap<Integer, String> lh=new LinkedHashMap<Integer, String>();	
	lh.put(1,"One");
	lh.put(2, "Two");
	lh.put(3, "Three");
	lh.put(4, "Four");
	lh.put(5, "Five");

	
	
	LinkedHashMap<Integer, String> lh2=new LinkedHashMap<Integer, String>();	
	lh2.put(1,"One");
	lh2.put(2, "Two");
	lh2.put(3, "Three");
	lh2.put(4, "Four");
	lh2.put(5, "Five");


	
	boolean a=lh.equals(lh2);
	System.out.println(a);

	
	System.out.println(lh);
	lh.clear();
	System.out.println(lh);
}
}
