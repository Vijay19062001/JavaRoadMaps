package JavaLearning.Week1;

public class Strings {


	    public static void main(String[] args) {
	        // 1. String Creation
	        String str1 = "Hello,World!";
	        String str2 = new String("Java Programming");

	        // 2. String Concatenation
	        String greeting = "Hello";
	        String name = "Alice";
	        String fullGreeting = greeting + ", " + name + "!";
	        System.out.println("Concatenated String: " + fullGreeting);
	        System.out.println();

	        // 3. String Length
	        System.out.println("Length of str1: " + str1.length());

	        // 4. Character at a Specific Index
	        char charAtIndex = str1.charAt(4);
	        System.out.println("Character at index 7 in str1: " + charAtIndex);
	        System.out.println();

	        // 5. Substring
	        String substring = str2.substring(5, 10); // Extract "Programming"
	        System.out.println("Substring from str2: " + substring);

	        // 6. String Comparison
	        boolean isEqual = str1.equals("Hello, World!");
	        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello, hello!");
	        System.out.println("str1 equals 'Hello, World!': " + isEqual);
	        System.out.println("str1 equals 'hello, world!' (ignore case): " + isEqualIgnoreCase);
	        System.out.println();

	        // 7. String Replacement
	        String replacedString = str2.replace("Java", "Python");
	        System.out.println("Replaced String: " + replacedString);
	        System.out.println();

	        // 8. String to Upper Case / Lower Case
	        String upperCaseString = str2.toUpperCase();
	        String lowerCaseString = str2.toLowerCase();
	        System.out.println("Upper Case: " + upperCaseString);
	        System.out.println("Lower Case: " + lowerCaseString);
	        System.out.println();

	        // 9. Trim Spaces
	        String withSpaces = "   Extra spaces   ";
	        String trimmedString = withSpaces.trim();
	        System.out.println("Trimmed String: '" + trimmedString + "'");
	        System.out.println();

	        // 10. Split String
	        String csv = "apple,banana,orange";
	        String[] fruits = csv.split(",");
	        System.out.println("Split String:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	        System.out.println();

	        // 11. Check if String Contains a Substring
	        boolean contains = str2.contains("Programming");
	        System.out.println("str2 contains 'Programming': " + contains);
	        System.out.println();

	        // 12. String Formatting
	        int age = 25;
	        String formattedString = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted String: " + formattedString);
	        System.out.println();

	    }
	   
	}


