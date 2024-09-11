package Week4;

import java.io.*;

class Employees implements Serializable {
    private static final long serialVersionUID = 1L; // Adding serialVersionUID for serializable class
    public int empId;
    public String empName;

    // Parameterized Constructor
    public Employees(int id, String name) {
        this.empId = id;
        this.empName = name;
    }
}

public class SerializationExample {

    public static void main(String[] args) {
        Employees object = new Employees(1, "Ram");
        String filename = "file.ser";

        // Serialization
        try {
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        Employees object1 = null;

        // Deserialization
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (Employees) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println("Employee Id = " + object1.empId);
            System.out.println("Employee Name = " + object1.empName);
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
