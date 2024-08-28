package Week2;

public class Methods {


	    // Method to add two numbers
	    public int add(int num1, int num2) {
	        return num1 + num2;
	    }

	    // Method to subtract two numbers
	    public int subtract(int num1, int num2) {
	        return num1 - num2;
	    }

	    // Method to multiply two numbers
	    public int multiply(int num1, int num2) {
	        return num1 * num2;
	    }

	    // Method to divide two numbers
	    public double divide(int num1, int num2) {
	        if (num2 != 0) {
	            return (double) num1 / num2;
	        } else {
	            System.out.println("Error! Division by zero.");
	            return 0;
	        }
	    }

	    public static void main(String[] args) {
	        // Creating an object of Methods class
	        Methods meths = new Methods();

	        // Using methods to perform calculations
	        int sum = meths.add(10, 5);
	        int difference = meths.subtract(10, 5);
	        int product = meths.multiply(10, 5);
	        double quotient = meths.divide(10, 5);

	        // Displaying the results
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        System.out.println("Quotient: " + quotient);
	    }
	}
