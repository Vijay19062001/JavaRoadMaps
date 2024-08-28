package Week3;

import java.util.*;

public class HashMaps {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Map<String, Double> hm = new HashMap<>();

        System.out.println("Enter the number of entries :");
        int numEntries = input.nextInt();
        input.nextLine();  

        for (int i = 0; i < numEntries; i++) {
            System.out.print("Enter name for entry : ");
            String name = input.nextLine();  

            System.out.print("Enter balance for entry : ");
            double balance = input.nextDouble();
            input.nextLine(); 
            hm.put(name, balance);
        }

        System.out.println("Size of the Hashmap: " + hm.size());

        System.out.println("Elements in the HashMap: " + hm);

        Set<Map.Entry<String, Double>> set = hm.entrySet();
        System.out.println("Displaying all entries in the HashMap:");

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        input.close();
    }
}
