package Week4;

public class ThrowExample {
	
	public static void checkAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Not Eligible to vote and drive!");
		}
		else {
			System.out.println("You are Eligible to vote and drive!");
			}
	}

	public static void main(String[] args) {

		try {
			checkAge(25);
		}
		catch(Exception e) {
			System.out.println("Exception caught :"+e);
			
		}
		System.out.println("program to continue...");
	}

}
