package basicprogram;



//Base class
class Shape {
 // Method to be overridden
 public void calculateArea() {
     System.out.println("Calculating area of a generic shape");
 }
}

//Derived class Rectangle
class Rectangle extends Shape {
 private double length;
 private double width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Overriding the calculateArea method
 @Override
 public void calculateArea() {
     double area = length * width;
     System.out.println("Area of Rectangle: " + area);
 }
}

//Derived class Circle
class Circle extends Shape {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Overriding the calculateArea method
 @Override
 public void calculateArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Area of Circle: " + area);
 }
}

//Main class
public class PolymorphismExample  {
 public static void main(String[] args) {
     // polymorphism allows objects of different derived classes to be treated as objects of the base class
	 Rectangle rectangle = new Rectangle(5, 4);
	 Circle circle = new Circle(3);

     // Polymorphism in action
     rectangle.calculateArea(); // Outputs: Area of Rectangle: 20.0
     circle.calculateArea();    // Outputs: Area of Circle: 28.274333882308138
 }
}


