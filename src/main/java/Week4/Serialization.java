package Week4;

import java.io.Serializable;
import java.io.*;
class Person implements Serializable{
    int id;
    String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Student extends Person{
    String course;
    int fee;
    public Student(int id, String name, String course, int fee) {
        super(id,name);
        this.course=course;
        this.fee=fee;
    }
}
public class Serialization {
    public static void main(String args[])
    {
        //Serialization
        try{
            //Creating the object
            Student s1 =new Student(211,"ravi","Engineering",50000);
            //Creating stream and writing the object
            FileOutputStream fouts=new FileOutputStream("f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fouts);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}
      //Deserialization
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            Student s=(Student)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}