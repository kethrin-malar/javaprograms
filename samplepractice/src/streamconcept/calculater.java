package streamconcept;


interface Square{
	int calculate(int x);
}

public class calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 5;
		
		Square s = (int x)->x*x;
		int result = s.calculate(a);
		System.out.println(result);

	}

}
