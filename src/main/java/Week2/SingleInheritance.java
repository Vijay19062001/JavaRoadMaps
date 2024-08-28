package Week2;

import java.util.Scanner;

class Employee {
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

class Managers extends Employee {
    String empDept;
    
    public void inputDepartment() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employee Department: ");
        empDept = input.nextLine();
        input.close();
    }
    
    public void displayDetail() {
        displayDetails();
        System.out.println("Employee Department: " + empDept); 
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Managers manage = new Managers();  
        manage.inputDetails();
        manage.inputDepartment(); 
        manage.displayDetail();
        
    }
    
}
