package Week4;

import java.io.*;


class Dog implements Serializable {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}

public class ObjectOutputExample {
    public static void main(String[] args) {

    	Dog dog1 = new Dog("Tyson", "Labrador");

        // Serialize the Dog object to a file
        try (FileOutputStream fileOut = new FileOutputStream("file.out");
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
            
            objOut.writeObject(dog1);
            System.out.println("Serialized data is saved in file.out");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the Dog object from the file
        try (FileInputStream fileIn = new FileInputStream("file.out");
             ObjectInputStream objIn = new ObjectInputStream(fileIn)) {
            
            Dog newDog = (Dog) objIn.readObject();
            System.out.println("Deserialized Dog:");
            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog Breed: " + newDog.breed);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
