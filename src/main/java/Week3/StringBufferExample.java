package Week3;

import java.util.Scanner;

public class StringBufferExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String:");
        String user = input.nextLine();

        StringBuffer stringBuffer = new StringBuffer(user);


        System.out.println("Original String: " + stringBuffer);

        // Append a string
        System.out.print("Enter a string to append: ");
        String appendString = input.nextLine();
        stringBuffer.append(appendString);
        System.out.println("After appending: " + stringBuffer);

        // Insert a string
        System.out.print("Enter a string to insert: ");
        String insertString = input.nextLine();
        System.out.print("Enter position to insert the string: ");
        int position = input.nextInt();
        
        stringBuffer.insert(position, insertString);
        System.out.println("After inserting: " + stringBuffer);

        // Delete a portion of the string
        System.out.print("Enter start index for deletion: ");
        int startIndex = input.nextInt();
        System.out.print("Enter end index for deletion: ");
        int endIndex = input.nextInt();
       
        stringBuffer.delete(startIndex, endIndex);
        System.out.println("After deletion: " + stringBuffer);

        // Replace a portion of the string
        System.out.print("Enter start index for replacement: ");
        int replaceStartIndex = input.nextInt();
        System.out.print("Enter end index for replacement: ");
        int replaceEndIndex = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter replacement string: ");
        String replacementString = input.nextLine();
        stringBuffer.replace(replaceStartIndex, replaceEndIndex, replacementString);
        System.out.println("After replacement: " + stringBuffer);

        // Reverse the string
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);

     
        input.close();
    }
}
