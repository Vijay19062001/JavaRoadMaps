package week5;

import java.util.*;
import java.util.stream.Collectors;


class Person{
     String name;
     int age;
     String city;



    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return name + " (" + age + ") from " + city;
    }
}

public class CollectorExamples {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("John", 25, "New York"),
                new Person("Jane", 22, "Los Angeles"),
                new Person("Mike", 32, "Chicago"),
                new Person("Anna", 30, "New York"),
                new Person("Tom", 35, "Los Angeles")
        );

        // 1. toList() - Collect all names into a List
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Names: " + names);

        // 2. toSet() - Collect all cities into a Set
        Set<String> cities = people.stream()
                .map(Person::getCity)
                .collect(Collectors.toSet());
        System.out.println("Unique cities: " + cities);

        // 3. joining() - Join all names into a single string
        String allNames = people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));
        System.out.println("Joined names: " + allNames);

        // 4. groupingBy() - Group people by their city
        Map<String, List<Person>> peopleByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));
        System.out.println("People grouped by city: " + peopleByCity);

        // 5. partitioningBy() - Partition people into two groups: older than 30 and not older than 30
        Map<Boolean, List<Person>> partitionedByAge = people.stream()
                .collect(Collectors.partitioningBy(p -> p.getAge() > 30));
        System.out.println("Partitioned by age > 30: " + partitionedByAge);

        // 6. counting() - Count the number of people
        long numberOfPeople = people.stream()
                .collect(Collectors.counting());
        System.out.println("Number of people: " + numberOfPeople);

        // 7. summarizingInt() - Get summary statistics for people's ages
        IntSummaryStatistics ageSummary = people.stream()
                .collect(Collectors.summarizingInt(Person::getAge));
        System.out.println("Age summary: " + ageSummary);

        // 8. toMap() - Create a map of person name to age
        Map<String, Integer> nameToAgeMap = people.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println("Map of names to ages: " + nameToAgeMap);

        // 9. reducing() - Sum the ages of all people
        int totalAge = people.stream()
                .collect(Collectors.reducing(0, Person::getAge, Integer::sum));
        System.out.println("Total age of all people: " + totalAge);

        // 10. mapping() - Group by city and map to only names
        Map<String, List<String>> namesByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println("Names grouped by city: " + namesByCity);
    }
}
