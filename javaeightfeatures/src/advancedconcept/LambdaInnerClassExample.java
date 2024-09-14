package advancedconcept;




@FunctionalInterface
interface Person {
    void eat();
}



public class LambdaInnerClassExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the eat() method
        Person p = () -> System.out.println("Nice fruits");

        p.eat();  // Calls the eat method, implemented using the lambda expression
    }
}
