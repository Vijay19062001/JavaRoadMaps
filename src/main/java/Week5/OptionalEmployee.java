package week5;


import java.util.Optional;
import java.util.Scanner;

class Employee{
    private String name;
    private Optional<String>email;

    Employee(String name,String email){
        this.name = name;
        this.email = Optional.ofNullable(email);
    }


    // Constructor without email
    Employee(String name){
        this.name = name;
        this.email = Optional.empty();

    }

    public void EmployeeDetails(){
        System.out.println("Employee name :" +name);
        System.out.println("Employee Email :"+email.orElse("Email is not provided"));
    }

}


public class OptionalEmployee {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Employee name : ");
        String name = input.next();
        System.out.print("Employee email : ");
        String email = input.next();

        Employee emp1 = new Employee(name,email);
        Employee emp2 = new Employee(name);

        System.out.println("\nEmployee Details 1: ");
        emp1.EmployeeDetails();

        System.out.println("\nEmployee Details 2: ");
        emp2.EmployeeDetails();

    }
}
