package JavaLearning.Week1;


public class Operators {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		int c=20; 
		
		//Arithmetic Operator
		System.out.println("Arithmetic Operator");
		System.out.println("The value of "+(a+b)); 
		System.out.println("The value of "+(a-b));
		System.out.println("The value of "+(a*b));
		System.out.println("The value of "+(a/b));
		System.out.println("The value of "+(a%b));
		System.out.println();
		
		//Ternary Operator
		System.out.println("Ternary Operator");
		int min=(a<b)?a:b;  
		System.out.println(min);  
		System.out.println();
		
		//Assignment Operator
		System.out.println("Assignment Operator");
		a+=4;  
		b-=4; 
		System.out.println(a);  
		System.out.println(b);  
		System.out.println();
		
		//Logical Operator
		System.out.println("Bitwise and Logical Operator");
		System.out.println(a>b&&a<c);  
		System.out.println(a>b||a<c);
		System.out.println(a);
		System.out.println(a);
		System.out.println();
		
		//Unary Operator
		System.out.println("Unary Operator");
		System.out.println(a++);
		System.out.println(++a); 
		System.out.println(a--); 
		System.out.println(--a);
	}

}
