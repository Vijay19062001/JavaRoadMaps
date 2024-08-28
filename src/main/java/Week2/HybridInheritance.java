package Week2;


import java.util.Scanner;


class Hybrid {
    String name;
    int id;

    public void inputPersonDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        this.name = input.nextLine();
        
        System.out.println("Enter ID: ");
        this.id = input.nextInt();
        input.nextLine(); 
        input.close();
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


interface Work {
    void workDetails();
}


interface Pay {
    void salaryDetails();
}

// Hierarchical Inheritance
class Emp extends Hybrid implements Work, Pay {
    double salary;

    @Override
    public void workDetails() {
        System.out.println("Employee is working.");
    }

    @Override
    public void salaryDetails() {
        System.out.println("Salary: $" + salary);
    }

    public void inputEmployeeData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        this.salary = input.nextDouble();
        input.nextLine(); 
        input.close();
    }

    public void displayEmployeeData() {
        displayPersonDetails();
        workDetails();
        salaryDetails();
    }
}

class Stud extends Hybrid {
    String course;

    public void inputStudentData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Course: ");
        this.course = input.nextLine();
        input.close();
    }

    public void displayStudentData() {
        displayPersonDetails();
        System.out.println("Course: " + course);
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
  
        Emp emp = new Emp();
        emp.inputPersonDetails();
        emp.inputEmployeeData();
        System.out.println("\nEmployee Details:");
        emp.displayEmployeeData();

        Stud stu = new Stud();
        stu.inputPersonDetails();
        stu.inputStudentData();
        System.out.println("\nStudent Details:");
        stu.displayStudentData();
    }
}
