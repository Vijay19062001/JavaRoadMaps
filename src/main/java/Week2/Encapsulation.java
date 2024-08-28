package Week2;

class Persons {  
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero.");
        }
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        
        Persons person = new Persons();

        // Set values using setters
        person.setName("Vijay");
        person.setAge(12);

        // Get values using getters and display them
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        
   
    }
}
