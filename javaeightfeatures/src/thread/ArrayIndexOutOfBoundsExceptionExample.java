package thread;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {  
	        
	        try{    
	             int a[]=new int[5];    
	             //a[] = 10;  // This will trigger ArrayIndexOutOfBoundsException
	             a[4]=10;
	            }    
	            
	            catch(ArrayIndexOutOfBoundsException e)  
	               {  
	                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
	               }    
	            catch(Exception e)  
	               {  
	                System.out.println("Parent Exception occurs");  
	               }             
	            System.out.println("rest of the code");    
	 }  
	}  





