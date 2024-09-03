package week5;


import java.util.*;
import java.util.stream.*;
public class StreamApiMethods {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("King", "sanjay", "Bob", "David", "Alice", "Eve", "Frank", "John");

        // 1. filter(Predicate): Filter names that start with "A"
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        // 2. map(Function): Convert names to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Upper Case Names: " + upperCaseNames);

        // 3. flatMap(Function): Flatten a list of lists into a single list
        List<List<String>> nestedNames = Arrays.asList(
                Arrays.asList("John", "Alice"),
                Arrays.asList("Bob", "David")
        );
        List<String> flatMappedNames = nestedNames.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("Flat Mapped Names: " + flatMappedNames);

        // 4. distinct(): Remove duplicate names
        List<String> distinctNames = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct Names: " + distinctNames);

        // 5. sorted(): Sort names alphabetically
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);

        // 6. limit(long n): Limit the stream to the first 3 names
        List<String> limitedNames = names.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Limited Names: " + limitedNames);

        // 7. skip(long n): Skip the first 2 names
        List<String> skippedNames = names.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("Skipped Names: " + skippedNames);

        // 8. peek(Consumer): Peek into the stream without modifying it
        List<String> peekedNames = names.stream()
                .peek(name -> System.out.println("Processing: " + name))
                .collect(Collectors.toList());
        System.out.println("Peeked Names: " + peekedNames);

        // 9. forEach(Consumer): Print each name
        System.out.println("ForEach:");
        names.stream().forEach(System.out::println);


        // 11. reduce(BinaryOperator): Concatenate all names
        String concatenatedNames = names.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("Concatenated Names: " + concatenatedNames);

        // 12. count(): Count the number of names
        long nameCount = names.stream().count();
        System.out.println("Name Count: " + nameCount);

        // 13. findFirst(): Find the first name
        Optional<String> firstName = names.stream().findFirst();
        System.out.println("First Name: " + firstName);

        // 14. findAny(): Find any name
        Optional<String> anyName = names.stream().findAny();
        System.out.println("Any Name: " + anyName);

        // 15. anyMatch(Predicate): Check if any name starts with "D"
        boolean anyStartsWithD = names.stream()
                .anyMatch(name -> name.startsWith("D"));
        System.out.println("Any name starts with 'D': " + anyStartsWithD);

        // 16. allMatch(Predicate): Check if all names are longer than 2 characters
        boolean allLongerThanTwo = names.stream()
                .allMatch(name -> name.length() > 2);
        System.out.println("All names longer than 2 characters: " + allLongerThanTwo);

        // 17. noneMatch(Predicate): Check if no name starts with "Z"
        boolean noneStartsWithZ = names.stream()
                .noneMatch(name -> name.startsWith("Z"));
        System.out.println("No name starts with 'Z': " + noneStartsWithZ);

        // 18. min(Comparator): Find the name with the minimum length
        Optional<String> shortestName = names.stream()
                .min(Comparator.comparingInt(String::length));
        System.out.println("Shortest Name: " + shortestName);

        // 19. max(Comparator): Find the name with the maximum length
        Optional<String> longestName = names.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println("Longest Name: " + longestName);
    }
}
