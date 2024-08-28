package JavaLearning.Week1;

import java.util.Scanner;
public class ElseifLadder {

	 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the student's marks: ");
	 int marks = input.nextInt();
	 char grade;
	 if (marks >= 90) {
	 grade = 'O';
	 } else if (marks >= 81) {
	 grade = 'A';
	 } else if (marks >= 71) {
	 grade = 'B';
	 } else if (marks >= 61) {
	 grade = 'C';
	 } else if (marks >= 50) {
	 grade = 'D';
	 } else {
	 grade = 'F';
	 }
	 System.out.println("The student's grade is: " + grade);
	 input.close();
	 }
	 }
