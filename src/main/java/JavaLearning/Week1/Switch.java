package JavaLearning.Week1;

import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Food menu ");
		System.out.println("1. Burger");
		System.out.println("2. Pizza");
		System.out.println("3. Cake");
		System.out.println("4. Salad");
		System.out.println("5. Coffee");
		
		System.out.print("Enter the choice (1-5) :");
		int choice=input.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("You Ordered a Burger");
			break;
			
		case 2:
			System.out.print("You Ordered a Pizza");
			break;
			
		case 3:
			System.out.print("You Ordered a Cake");
			break;
			
		case 4:
			System.out.print("You Ordered a Salad");
			break;
			
		case 5:
			System.out.print("You Ordered a Coffee");
			break;
			
		default:

			System.out.print("Invalid choice. Please enter the number between (1 to 5)");
			break;
		}
		input.close();

	}

}
