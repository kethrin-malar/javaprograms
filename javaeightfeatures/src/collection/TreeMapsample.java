package collection;

import java.util.TreeMap;
/*
 Removes all of the mappings from TreeMap.The Map will be Empty after calling this method.
 TreeMap clear method has been implemented from Map interface and overridden from AbstractMap.  
*/
public class TreeMapsample {
public static void main(String[] args)
{
	TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
	tm.put(1, "Java");
	//tm.put("Course", "Java");
	tm.put(10, "Candid");
	tm.put(5,"9999");
	tm.put(11, "Chennai");
	System.out.println(tm);
	
	System.out.println(tm.descendingMap());
	
	tm.clear();
	System.out.println(tm);
}
}



