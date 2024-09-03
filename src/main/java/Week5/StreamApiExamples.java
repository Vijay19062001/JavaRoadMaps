package week5;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;


public class StreamApiExamples {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(2,3,8,4,8);
        numbers.stream()
                .map(n -> n*n)
                .forEach(System.out::println);

        numbers.stream()
                .distinct()
                .collect(Collectors.toList());
             System.out.println("Filter numbers :"+numbers);



    }
}
