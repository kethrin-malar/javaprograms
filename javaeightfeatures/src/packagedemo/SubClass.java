package packagedemo;

import java.util.Arrays;

import accessmodifier.ClassA;

public class SubClass extends ClassA {

	 public void display() {
	        // System.out.println("privateVar: " + privateVar); // Not accessible
	        //System.out.println("defaultVar: " + defaultVar); // Not accessible
	        System.out.println("protectedVar: " + protectedVar); // Accessible due to inheritance
	        System.out.println("publicVar: " + publicVar); // Accessible
	    }
	 public static void main(String[] args) {
		 SubClass obj = new SubClass();
		 obj.display();		 
	 }
}


