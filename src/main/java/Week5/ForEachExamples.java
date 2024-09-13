package week5;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//List

//public class ForEachExamples {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Gowtham", "Vicky", "Suresh");
//
//        // Using forEach method with lambda expression
//        names.forEach(name -> System.out.println(name));
//    }
//}


//  Map
public class ForEachExamples {
    public static void main(String[] args) {
        Map<Integer, String>employees = new HashMap<>();

        employees.put(12, "Divya");
        employees.put(20,"Dina");
        employees.put(23, "Vicky");

        employees.forEach((id, name) -> System.out.println(id + ": " + name));
    }
}