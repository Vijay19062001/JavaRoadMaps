package Week4;
import java.util.regex.*;

public class RegExExample {

    public static void main(String[] args) {
        // Define a regex pattern for a valid email address
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        // Compile the regex into a Pattern object
        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern passwordPattern = Pattern.compile(passwordRegex);

        // Test string
        String email = "Ajay1234@example.com";
        String password = "Ajay@1";

        // Create a Matcher object
        Matcher emailMatcher = emailPattern.matcher(email);
        Matcher passwordMatcher = passwordPattern.matcher(password);

        // Check if the email matches the pattern
        if (emailMatcher.matches()) {
            System.out.println(email + " is a valid email.");
        } else {
            System.out.println(email + " is not a valid email.");
        }

        // Check if the password matches the pattern
        if (passwordMatcher.matches()) {
            System.out.println(password +" is a valid.");
        } else {
            System.out.println(password +" is not valid.");
        }
    }
}
