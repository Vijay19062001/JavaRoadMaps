package Week3;


import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your feedback: ");
        String feedback = input.nextLine();

        StringTokenizer st = new StringTokenizer(feedback, " ,.");

        System.out.println("Number of words: " + st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        input.close();
    }
}

