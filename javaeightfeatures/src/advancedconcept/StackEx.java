package advancedconcept;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Object> s = new Stack<>();
		s.add(110);
		s.add(20);
		s.add(40);
		s.add("malar");
		
		System.out.println("Before push the element:"+s);
		
		s.push(60);
		System.out.println("After push the element:"+s);
		
		System.out.println(s.pop());
		
		s.peek();
		System.out.println("peek of the element:"+ s);

	}

}
