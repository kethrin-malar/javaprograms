package basicprogram;


public class StaticBlockExample {

    // Static variable
    static int number;

    // Static block
    static {
        number = 10;
        System.out.println("Static block executed. Number is set to: " + number);
    }

    // Constructor
    public StaticBlockExample() {
        System.out.println("Constructor called.");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main method started.");
        
        // Creating an instance of the class
        StaticBlockExample example = new StaticBlockExample();
      
        
        System.out.println("Main method ended.");
    }
}

