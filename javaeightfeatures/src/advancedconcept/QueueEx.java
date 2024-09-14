package advancedconcept;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer>q = new LinkedList<Integer>();
		q.add(10);
		q.add(70);
		q.add(100);
		
		q.peek();
		System.out.println("RESULT:"+q);
		
		Integer front =q.remove();
		System.out.println("RESULT:"+q);
		
		Integer rear =q.remove();
		System.out.println("RESULT:"+q);


	}

}
