package Week5;

import java.util.function.Function;



public class MethodReferenceExample {

    public static void main(String[] args) {
        // Create an instance of the class
        MethodReferenceExample example = new MethodReferenceExample();

        // Reference to an instance method of a particular object
        Function<String, String> function = example::convertToUpperCase;

        // Applying the method reference
        String result = function.apply("It is java developer team");

        // Output the result
        System.out.println("Result: " + result); // Output: Result: HELLO
    }

    // Instance method to be referenced
    public String convertToUpperCase(String input) {
        return input.toUpperCase();
    }
}
