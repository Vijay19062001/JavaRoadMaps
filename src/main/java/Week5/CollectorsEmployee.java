package week5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employe{
    private String name;
    private double salary;


    Employe(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}



public class CollectorsEmployee{

    public static void main(String[] args) {

        List<Employe> employe = Arrays.asList(

                new Employe("Arun", 12000.0),
                new Employe("Vignesh", 2000.0),
                new Employe("Kalai", 15000.0)
        );

        List<String>employeeNames = employe.stream()
                .map(Employe::getName)
                .collect(Collectors.toList());

        List<Double> employeeSalaries = employe.stream()
                .map(Employe::getSalary)
                .collect(Collectors.toList());

        // Print employee names and salaries
        System.out.println("Employee names: " + employeeNames);
        System.out.println("Employee salaries: " + employeeSalaries);

    }

}