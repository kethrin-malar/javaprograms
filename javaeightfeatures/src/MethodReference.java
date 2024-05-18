
public class MethodReference {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2=new Thread(MethodReference::ThreadStatus);  //ContainingClass::staticMethodName  
        t2.start();       
    }  
}  