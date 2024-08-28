package Week2;

import java.util.Scanner;

// Base class
class Aaludra {
    String empName;
    int empId;

    public void inputDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employee name: ");
        this.empName = input.nextLine();
        
        System.out.println("Enter the Employee ID: ");
        this.empId = input.nextInt();
        input.nextLine();  
        input.close();
    }

    public void displayDetails() {
        System.out.println("Employee name: " + empName);
        System.out.println("Employee ID: " + empId);
    }
}

// Intermediate class
class Manager extends Aaludra {
    String empDept;

    public void inputDepartment() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employee Department: ");
        this.empDept = input.nextLine();
        input.close();
    }

    public void displayDepartment() {
        System.out.println("Employee Department: " + empDept);
    }
}

// Derived class
class Director extends Manager {
    double empSalary;

    public void inputSalary() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employee Salary: ");
        this.empSalary = input.nextDouble();
        input.close();
    }

    public void displaySalary() {
        System.out.println("Employee Salary: " + empSalary);
    }
}

// Main class
public class Multilevelinheritance {
    public static void main(String[] args) {
        Director director = new Director();
        director.inputDetails();
        director.inputDepartment();
        director.inputSalary();
        director.displayDetails();
        director.displayDepartment();
        director.displaySalary();
    }
}
