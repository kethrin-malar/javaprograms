package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTablesample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hashtable<String,String> hashTable=new Hashtable<String,String>(); 
		hashTable.put("Java", "James Gosling");
		hashTable.put("C", "Dennis Ritchie");
		hashTable.put("C++", "Bjarne Stroustrup");
		hashTable.put("Python", "Guido van Rossum");
		hashTable.put("Spring", "Rod Johnson");
		
		  for(Map.Entry m:hashTable.entrySet()){  
			   System.out.println(m.getKey()+" : "+m.getValue());  
			  }
	}

}

