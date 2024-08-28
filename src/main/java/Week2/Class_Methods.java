package Week2;

public class Class_Methods {
	
	public static void myMethod() {
		System.out.println("I just got Selected");
	}
	public static void myModel(String fname) {
		System.out.println(fname +" You did not Selected");
	}
	private static void myMethods() {
		System.out.println("you just Waiting list");
	}
	public static int myMeth(int a) {
		return 5+a;
	}
	public static int myMeths(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		
		myMethod();
		myModel("Arun");
		myMethods();
		System.out.println(myMeth(4));
		System.out.println(myMeths(4,5));
		

	}

}
