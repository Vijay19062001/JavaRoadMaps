package week5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

// 1. Define a repeating annotation container
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Authors {
    Author[] value();
}

// 2. Define a repeatable annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(Authors.class)
@interface Author {
    String name();
}


// Type annotation for example
@Target(ElementType.TYPE_USE)
@interface NonNull {}

public class AnnotationExample {

    // Method with repeating annotations
    @Author(name = "Vinoth")
    @Author(name = "Sanjay")
    public void someMethod() {
        System.out.println("This method has multiple authors.");
    }

    // Method demonstrating type annotation
    public static void processNames(List<@NonNull String> names) {
        // This simulates processing a list where none of the values should be null
        String nonNullNames = names.stream()
                .filter(Objects::nonNull) // Type annotations can be used for static analysis tools
                .collect(Collectors.joining(", "));
        System.out.println("Processed names: " + nonNullNames);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        // Example of repeating annotations
        Author[] authors = AnnotationExample.class.getMethod("someMethod").getAnnotationsByType(Author.class);
        System.out.println("Authors of someMethod:");
        for (Author author : authors) {
            System.out.println(author.name());
        }

        // Example of type annotation (used in processing)
        List<String> names = new ArrayList<>();
        names.add("Vinoth");
        names.add("Sanjay");
        names.add(null);  // This could be caught by static analysis if the type annotation is enforced
        processNames(names);  // Simulating processing of non-null names
    }
}
