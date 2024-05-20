package accessmodifier;

public class ClassA {
	
	 private int privateVar = 1;
	    int defaultVar = 2; // default access modifier
	    protected int protectedVar = 3;
	    public int publicVar = 4;

	    public void display() {
	        // All variables are accessible within the same class
	        System.out.println("privateVar: " + privateVar);
	        System.out.println("defaultVar: " + defaultVar);
	        System.out.println("protectedVar: " + protectedVar);
	        System.out.println("publicVar: " + publicVar);
	    }
	    
	    public static void main(String[] args) {
	    	ClassA obj1 = new ClassA();
	    	obj1.display();
	    }
}
