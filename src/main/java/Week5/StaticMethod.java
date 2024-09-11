package week5;

interface MyInterface {
    static void student() {
        System.out.println("Student Developer");
    }

    default void defaultMethod() {
        System.out.println("It is a Map Developer");
    }
}

public class StaticMethod implements MyInterface {

    public static void main(String[] args) {
        StaticMethod stu = new StaticMethod();
        stu.defaultMethod();

        MyInterface.student();
    }
}
