package basicprogram;


class Engine { //Engine class

 public void start() {               // Method to start the engine
     System.out.println("Engine is starting...");
 }

 
 public void stop() {                  // Method to stop the engine
     System.out.println("Engine is stopping...");
 }
}


//Car class
class Car {
 private Engine engine; // Car has an Engine

 // Constructor
 public Car() {
     engine   = new Engine(); // Initializing the Engine object
 }

 // Method to start the car
 public void startCar() {
     System.out.println("Starting the car...");
     engine.start();
 }

 // Method to stop the car
 public void stopCar() {
     System.out.println("Stopping the car...");
     engine.stop();
 }
}

//Main class
public class CompositionExample {
 public static void main(String[] args) {
     // Create a Car object
     Car myCar = new Car();

     // Start and stop the car
     myCar.startCar();
     myCar.stopCar();
 }
}

