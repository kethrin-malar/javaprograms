package basicprogram;


public class employeeaggregationsample {  
int id;  
String name;  
Address address;  
  
public employeeaggregationsample(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
Address address1=new Address("gzb","UP","india");  
Address address2=new Address("gno","UP","india");  
  
employeeaggregationsample e=new employeeaggregationsample(111,"varun",address1);  
employeeaggregationsample e2=new employeeaggregationsample(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
}
