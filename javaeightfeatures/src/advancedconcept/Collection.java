package advancedconcept;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,String> obj = new LinkedHashMap<Integer,String>();
		
		obj.put(1,"Malar" );

		obj.put(2,"Reena" );

		obj.put(3, "varrun");

		obj.put(4,"John" );
		
		
LinkedHashMap<Integer,String> obj1 = new LinkedHashMap<Integer,String>();
		
		obj1.put(1,"Malar" );

		obj1.put(2,"Reena" );

		obj1.put(3, "Kamal");

		obj1.put(4,"John" );
		
		boolean a = obj.equals(obj1);
		System.out.println();
		/*obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		
		LinkedHashSet
		int a =obj.size();
		System.out.println(a);*/
		
		/*LinkedList
		obj.addFirst(100);
		System.out.println("print Result:"+obj);
		
		obj.addLast(100);
		System.out.println("print Result:"+obj);*/
		
		System.out.println("print Result:"+obj);
		
		obj.remove(3);
		System.out.println("print Result:"+obj);
		
				obj.clear();
		System.out.println("print Result:"+obj);
		
		
	}

}
