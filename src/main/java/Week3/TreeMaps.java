package Week3;


import java.util.*;

public class TreeMaps {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		TreeMap<Integer, String>treeMap=new TreeMap<>();
		
		System.out.print("Enter the number of entries from tree map:");
		int n = input.nextInt();
		input.nextLine();
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter key (Integer) for TreeMap: ");
			int key = input.nextInt();
			input.nextLine();
			
			System.out.print("Enter value (String) for TreeMap: ");
			String value=input.nextLine();
			
			
			treeMap.put(key, value);

		}
        System.out.println("TreeMap: " + treeMap);
        
        System.out.print("Enter key to retrieve value: ");
        int keyToRetrieve = input.nextInt();
        System.out.println("Value for key " + keyToRetrieve + ": " + treeMap.get(keyToRetrieve));
 
        // Get the first and last key in the map
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());
        
        // Get the greatest key strictly less than the given key
        System.out.print("Enter key to find lower key: ");
        int lowerKeyInput = input.nextInt();
        System.out.println("Key lower than " + lowerKeyInput + ": " + treeMap.lowerKey(lowerKeyInput));
        
        // Get the least key strictly greater than the given key
        System.out.print("Enter key to find higher key: ");
        int higherKeyInput = input.nextInt();
        System.out.println("Key higher than " + higherKeyInput + ": " + treeMap.higherKey(higherKeyInput));
        
        // Get a subMap (exclusive of endKey)
        System.out.print("Enter start key for subMap: ");
        int startKey = input.nextInt();
        System.out.print("Enter end key for subMap: ");
        int endKey = input.nextInt();
        System.out.println("SubMap from " + startKey + " to " + endKey + ": " + treeMap.subMap(startKey, endKey));
        
        // Remove an entry
        System.out.print("Enter key to remove from TreeMap: ");
        int keyToRemove = input.nextInt();
        treeMap.remove(keyToRemove);
        System.out.println("TreeMap after removing key " + keyToRemove + ": " + treeMap);
        
        // Navigating the map using a descending order
        System.out.println("TreeMap in descending order: " + treeMap.descendingMap());
        
        // Iterate through the TreeMap
        System.out.println("Iterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
       input.close(); 

	}

}
