package week5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Customers {
    String name;
    int age;
    double salary;

    public Customers(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        List<Customers> customersList = new ArrayList<>();

        customersList.add(new Customers("Hari", 20, 20000));
        customersList.add(new Customers("Vishnu", 44, 80000));
        customersList.add(new Customers("Arun", 30, 40000));
        customersList.add(new Customers("Ajith", 35, 60000));

//        List<Customers> olderAge = customersList.stream()
//                .filter(c ->c.getAge()<30 )
//                .collect(Collectors.toList());
//
//        olderAge.forEach(customers -> System.out.println(customers.getName()+" Age "+customers.getAge()));

//   double averageList=customersList.stream()
//           .mapToDouble(Customers::getSalary)
//           .average()
//           .orElse(0);
//   System.out.println("Average salary: "+averageList);


//   double highestSalary=customersList.stream()
//           .mapToDouble(Customers::getSalary)
//           .max()
//           .orElse(0.0);
//        System.out.println(highestSalary);




   List<String> names=customersList.stream()
           .map(Customers::getName)
           .collect(Collectors.toList());


   names.forEach(System.out::println);






    }
}
