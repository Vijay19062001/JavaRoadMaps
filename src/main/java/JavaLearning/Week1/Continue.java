package JavaLearning.Week1;

import java.util.Scanner;
public class Continue {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter a grade :");
			int grade=input.nextInt();
			
			if(grade <0) {
				System.out.println("Stopping grade input");
				break;
			}
			if(grade <60) {
				continue;
			}
			System.out.println("Passing grade "+grade);
		}
		input.close();

	}

}
