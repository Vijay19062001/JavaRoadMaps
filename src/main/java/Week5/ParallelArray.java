package week5;

import java.util.Arrays;


public class ParallelArray {
    public static void main(String[] args) {

        int[] numbers = { 12, 3, 1, 67, 31, 8, 56, 7 };

        System.out.println("Unsorted Array : ");

        Arrays.stream(numbers)
                .forEach(n->System.out.print(n+" "));
        System.out.println();

        Arrays.parallelSort(numbers);

        System.out.println("Sorted Array : ");

        Arrays.stream(numbers)
                .forEach(n -> System.out.print(n+ " "));



    }
}

