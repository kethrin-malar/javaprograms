package functionalinterfacesample;


interface TestInterface 
{ 
    // abstract method 
    public void square(int a); 
  
    // default method 
    default void show() 
    { 
      System.out.println("Default Method Executed"); 
    } 
    
    static void message() {
    	System.out.println("this is a static method example....");
    }
} 
  
class StaticDefaultMethodExample implements TestInterface 
{ 
    // implementation of square abstract method 
    public void square(int a) 
    { 
        System.out.println(a*a); 
    } 
  
    public static void main(String args[]) 
    { 
    	StaticDefaultMethodExample d = new StaticDefaultMethodExample(); 
        d.square(4); 
  
        // default method executed 
        d.show(); 
        
        TestInterface.message();
    } 
} 
