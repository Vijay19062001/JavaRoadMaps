package week5;

import java.util.Optional;


import java.util.stream.Stream;

public class StreamApiExamples {

//    static class User {
//        String name;
//        boolean active;
//
//        // Constructor should be inside the User class
//        User(String name, boolean active) {
//            this.name = name;
//            this.active = active;
//        }
//
//        // Method to check if the user is active
//        boolean isActive() {
//            return active;
//        }
//
//        @Override
//        public String toString() {
//            return name;
//        }
//    }
//
//   // public static void main(String[] args) {
//        // Stream of users
//        Stream<User> users = Stream.of(
//                new User("John", true),
//                new User("Surya", false),
//                new User("Arun", true),
//                new User("David", false)
//        );
//
//        // Filter active users
//        Stream<User> activeUsers = users.filter(User::isActive);
//
//        // Print active users
//        activeUsers.forEach(System.out::println);

//        Stream<Integer>stream = Stream.of(2,3,4,5,6);
//        Stream<Integer>filteredStream = stream.filter(n->n%3==0);
//        filteredStream.forEach(System.out::println);


//        Stream<String>stream = Stream.of("Arun","vijay");
//
//        stream.peek(System.out::println)
//                .forEach(s -> {});


            public static void main(String[] args) {
                Stream<String> stream = Stream.of("apple", "banana", "cherry");

                // Use peek() to print elements at different stages of the pipeline
                stream.peek(e -> System.out.println("Original: " + e))
                        .map(String::toUpperCase)
                        .peek(e -> System.out.println("Uppercased: " + e))
                        .filter(s -> s.startsWith("A"))
                        .peek(e -> System.out.println("Filtered: " + e))
                        .forEach(s -> {}); // Terminal operation to trigger the stream processing
            }
        }







