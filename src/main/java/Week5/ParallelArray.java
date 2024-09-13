package week5;

import java.util.Arrays;


public class ParallelArray {
    public static void main(String[] args) {

        int[] numberArray = { 12, 3, 1, 67, 31, 8, 56, 7 };
        System.out.println("Array Before Sorting");

        System.out.println(Arrays.toString(numberArray));
        Arrays.parallelSort(numberArray);

        System.out.println("Array After Parallel Sorting");
        System.out.println(Arrays.toString(numberArray));

        System.out.println("Displaying Array Using Stream and ForEach");
        Arrays.stream(numberArray).forEach(number -> System.out.print(number + " "));

    }
}