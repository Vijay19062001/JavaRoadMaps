package JavaLearning.Week1;

import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number :");
		int number=input.nextInt();
		
		if(number >0) {
			System.out.println("The number is Positive");
		}
		else if(number < 0) {
			System.out.println("The number is Negative");
		}
		else
			System.out.println("The number is Zero");
		
		input.close();
	}
	

}
  
