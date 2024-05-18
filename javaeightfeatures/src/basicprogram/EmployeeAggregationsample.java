package basicprogram;


public class EmployeeAggregationsample {  
int id;  
String name;  
Address address;  
  
public EmployeeAggregationsample(int id, String name,Address address) {  
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
  
EmployeeAggregationsample e=new EmployeeAggregationsample(111,"varun",address1);  
EmployeeAggregationsample e2=new EmployeeAggregationsample(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
}
