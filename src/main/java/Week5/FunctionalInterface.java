
package week5;


interface MathOperation {
    int operate(int a, int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // Using a lambda expression to define the logic for addition
        MathOperation add = (a, b) -> a + b;

        // Using a lambda expression to define the logic for subtraction
        MathOperation subtract = (a, b) -> a - b;

        // Using a method that accepts the functional interface
        System.out.println("Addition: " + executeOperation(5, 3, add));
        System.out.println("Subtraction: " + executeOperation(5, 3, subtract));
    }

    public static int executeOperation(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
