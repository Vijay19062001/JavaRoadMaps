package Week3;

import java.util.Scanner;
class Shapes {
   public double calculateArea(double radius){
	return 22/7*radius*radius;
}
	
public double calculateArea1(double side){
	return side * side;
}

public double CalculateArea(double length ,double width) {
	return length * width;
}
	
public double calculateArea2(double base ,double height) {
	return 0.5*base * height;
}
}

public class Compile_timePolymorphism { 
	
	public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  Shapes shape = new Shapes();
	  System.out.print("Enter the radius of circle: ");
	  double radius = input.nextDouble();
	   System.out.println("Area of the circle: " + 
	   shape.calculateArea(radius));
	 System.out.println();
	 System.out.print("Enter the side of Square : ");
	 double side = input.nextDouble();
	 System.out.println("Area of the Square: " + 
	shape.calculateArea1(side));
	 System.out.println();
	 
	 System.out.print("Enter the length of rectangle: ");
	 double length = input.nextDouble();
	 System.out.print("Enter the width of rectangle: ");
	 double width = input.nextDouble();
	 System.out.println("Area of rectangle: " + 
	shape.CalculateArea(length, width));
	 System.out.println();
	 
	 System.out.print("Enter the base of Triangle: ");
	 double base = input.nextDouble();
	 System.out.print("Enter the height of Triangle: ");
	 double height = input.nextDouble();
	 System.out.println("Area of Triangle: " + 
	shape.calculateArea2(base, height));
	 
	 input.close();
	}
	
	}
