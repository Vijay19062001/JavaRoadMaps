package Week4;

import java.io.*;

 class User implements Externalizable {
    private String name;
    private int age;
    public User(){}
    public User(String userName,int age){
        this.name= userName;
        this.age=age;
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException {
        name=(String) in.readObject();
        age=in.readInt();
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
    }

    public String getUserName() {
        return name;
    }
    public void setUserName(String userName) {
        this.name = userName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class Externalization {
    public static void main(String... args) throws Exception, IOException{
        File fe= new File("Test.txt");
        User ur= new User("Suriya",25);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fe));
        out.writeObject(ur);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fe));
        ur=(User)in.readObject();
        System.out.println("After De externalization username: " +ur.getUserName()+" and age is:"+ur.getAge());
    }
}