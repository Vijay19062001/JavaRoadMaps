package Week3;


import java.util.Scanner;

class Shape{
	public double CalculateArea() {
		return 0;
	}
	
}
class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
		
	}
	
	public double CalculateArea() {
		return 22/7 * radius* radius;
	}
	
}

class Square extends Shape{
	double side;
	
	Square(double side){
		this.side = side;
	}
	
	public double CalculateArea() {
		return side * side;
	}
	
}

class Rectangle extends Shape{
	double length, width;
	
	Rectangle(double length, double width){
		this.length = length;
		this.width= width;
	}
	
	public double CalculateArea() {
		return length * width;
	}
	
}

class Triangle extends Shape{
	double base, height;
	
	Triangle(double base, double height){
		this.base = base;
		this.height = base;
	}
	
	public double CalculateArea() {
		return 0.5 * base * height;
		
	}
}

public class Runtime_Polymorphism {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle :");
		double radius = input.nextDouble();
		Shape circle= new Circle(radius);
		System.out.println("Area of the Circle :"+circle.CalculateArea());
		
		
		System.out.println("Enter the side of the Square :");
		double side = input.nextDouble();
		Shape square = new Square(side);
		System.out.println("Area of the Square :"+square.CalculateArea());
		
		System.out.println("Enter the length of the Rectangle :");
		double length = input.nextDouble();
		System.out.println("Enter the width of the Rectangle :");
		double width = input.nextDouble();
		Shape rectangle = new Rectangle(length,width);
		System.out.println("Area of the Rectangle :"+rectangle.CalculateArea());
		
		
		System.out.println("Enter the base of the Triangle :");
		double base = input.nextDouble();
		System.out.println("Enter the height of the Triangle :");
		double height = input.nextDouble();
		Shape triangle = new Triangle(base,height);
		System.out.println("Area of the Triangle :"+triangle.CalculateArea());
        
		input.close();
	}
	

}
