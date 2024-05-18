package collection;

import java.util.Stack;

public class Stacksample {

	public static void main(String[] args) {
		Stack<String> sk = new Stack<String>();
		sk.add("Java");
		sk.add("Candid");
		sk.add("Spring");
		sk.add("Maven");
		sk.add("Methods");
		System.out.println("Stack sk before using pop method is : " + sk);
		
		sk.push("python");
		System.out.println("Stack s after using push method is : "+sk);

		System.out.println(sk.pop());
		System.out.println("Stack sk after using pop method is : " + sk);
		
		
		
		System.out.println("Stack st after using peek method is : "+sk.peek());
	


	}
}
