package Week4;


import java.util.*;

class Container<T>{
  private T content;

  public void setContent(T content){
       this.content = content;
  }
  public T getContent(){
        return content;
    }

}

public class Generics {
    // Generic method with type parameter T
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    // Bounded type parameter: T must extend Number

    public static <T extends Number> double addNumbers(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    // Using wildcards with upper bound

    public static void printNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){

        // Using a generic class
        Container<String> stringBox = new Container<>();
        stringBox.setContent("Hello Generics");
        System.out.println("Box contains: " + stringBox.getContent());

        Container<Integer> intBox = new Container<>();
        intBox.setContent(123);
        System.out.println("Box contains: " + intBox.getContent());

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Generics", "in", "Java"};
        System.out.print("Integer Array: ");
        printArray(intArray);
        System.out.print("String Array: ");
        printArray(strArray);

        // Using bounded type parameter
        System.out.println("Sum of numbers: " + addNumbers(10, 20));   // Works with Integer
        System.out.println("Sum of numbers: " + addNumbers(3.5, 2.5)); // Works with Double


        // Using wildcards with upper bound
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.print("Number List: ");
        printNumbers(intList);  // Works with List of Integer (subtype of Number)

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(1.68);
        System.out.print("Number List: ");
        printNumbers(doubleList);

    }


}
