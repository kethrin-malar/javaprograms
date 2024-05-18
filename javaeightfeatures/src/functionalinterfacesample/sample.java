package functionalinterfacesample;

@FunctionalInterface  
interface sayable{  
    void say(String msg);  
}  
public class sample implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	sample fie = new sample();  
        fie.say("Hello there");  
    }  
}  

