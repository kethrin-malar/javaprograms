package basicprogram;

class Creature {  
    String color = "white";  
}

class van extends Creature {  
    String color = "black";  

    void printColor() {  
        System.out.println(color); // prints color of Dog class  
        System.out.println(super.color); // prints color of Creature class  
    }  
}

public class Superkeyword {  
    public static void main(String[] args) {  
        van d = new van();  
        d.printColor();  
    }  
}
