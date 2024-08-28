package Week4;

public class Finally {

	    public static void main(String[] args) {
	        try {
	        	System.out.println ("Try Block:");
	            int data = 30 / 0; 
	            System.out.println ("Result: "+data);
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("ArithmeticException caught: " + e);
	            System.out.println ("catch Block");
	        } finally {
	        	System.out.println ("Finally Block");
	            System.out.println("No Exception,This block will always execute.");
	        }
	    }
	}


