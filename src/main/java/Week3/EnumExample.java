package Week3;

import java.util.Scanner;

enum Day{SUNDAY, MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}


public class EnumExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a day of the week :");
		String weeks = input.next().toUpperCase();
		
		try {
			Day today = Day.valueOf(weeks);
			System.out.println("Today is :"+today);
			
			switch(today) {
			case MONDAY:
				System.out.println("Start of the work week.");
				break;
				
			case FRIDAY:
				System.out.println("End of the work week.");
				break;
				
			case SUNDAY:
				System.out.println("Its a weekend!.");
				break;
				
			default:
				System.out.println("It's a regular day.");
			}
			
			for(Day day : Day.values()) {
				System.out.println(day);
			}
			
		}catch (IllegalArgumentException e) {
            System.out.println("Invalid day , Please try again with a valid day.");
        }
		input.close();

	}
	

}
