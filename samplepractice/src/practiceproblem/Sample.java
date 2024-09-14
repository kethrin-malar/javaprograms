package practiceproblem;

class CustomException extends Exception {
	public CustomException(String str) {
		
	}
}

	public class Sample {
	static void valid(int age) throws CustomException{
		if(age<18) {
			throw new CustomException("not to vote this canditate");
			
		}else {
			System.out.println("valid for vote");
		}
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				valid(13);
			} catch (CustomException ex) {
				System.out.println("caught the error");
			}
			System.out.println("rest of the code");

		}

	}

