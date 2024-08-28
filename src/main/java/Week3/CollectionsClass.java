package Week3;

import java.util.*;

public class CollectionsClass {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // 1. ArrayList Example (List)
        List<String> arrayList = new ArrayList<>();
        System.out.print("Enter the number of elements for ArrayList: ");
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element for ArrayList: ");
            String element = input.nextLine();
            arrayList.add(element);
        }
        System.out.println("ArrayList: " + arrayList);
        
        // 2. LinkedList Example (List & Deque)
        List<String> linkedList = new LinkedList<>();
        System.out.print("Enter the number of elements for LinkedList: ");
        int m = input.nextInt();
        input.nextLine(); 
        
        for (int i = 0; i < m; i++) {
            System.out.print("Enter element for LinkedList: ");
            String element = input.nextLine();
            linkedList.add(element);
        }
        System.out.println("LinkedList: " + linkedList);
        
        LinkedList<String> linkedLists = new LinkedList<>();
        Deque<String> deque = (Deque<String>) linkedLists;
        System.out.print("Enter element to add to the beginning of the LinkedList: ");
        String firstElement = input.nextLine();
        deque.addFirst(firstElement);
        
        System.out.print("Enter element to add to the end of the LinkedList: ");
        String lastElement = input.nextLine();
        deque.addLast(lastElement);
        System.out.println("LinkedList after deque operations: " + deque);

        // 3. HashSet Example (Set)
        Set<String> hashSet = new HashSet<>();
        System.out.print("Enter the number of elements for HashSet: ");
        int h = input.nextInt();
        input.nextLine(); 
        
        for (int i = 0; i < h; i++) {
            System.out.print("Enter element for HashSet: ");
            String element = input.nextLine();
            hashSet.add(element);
        }
        System.out.println("HashSet: " + hashSet);

        // 4. TreeSet Example (SortedSet)
        SortedSet<String> treeSet = new TreeSet<>();
        System.out.print("Enter the number of elements for TreeSet: ");
        int t = input.nextInt();
        input.nextLine(); 
        
        for (int i = 0; i < t; i++) {
            System.out.print("Enter element for TreeSet: ");
            String element = input.nextLine();
            treeSet.add(element);
        }
        System.out.println("TreeSet (sorted): " + treeSet);

        // 5. PriorityQueue Example (Queue)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        System.out.print("Enter the number of elements for PriorityQueue: ");
        int pq = input.nextInt();
        
        for (int i = 0; i < pq; i++) {
            System.out.print("Enter integer for PriorityQueue: ");
            int element = input.nextInt();
            priorityQueue.add(element);
        }
        System.out.println("PriorityQueue (ordered by priority): " + priorityQueue);

        // Polling from PriorityQueue (removes the head of the queue)
        System.out.println("PriorityQueue after polling: " + priorityQueue.poll());
        System.out.println("PriorityQueue after polling: " + priorityQueue);

        // 6. HashMap Example (Map)
        Map<String, Integer> hashMap = new HashMap<>();
        System.out.print("Enter the number of entries for HashMap: ");
        int hm = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < hm; i++) {
            System.out.print("Enter key (String) for HashMap: ");
            String key = input.nextLine();
            System.out.print("Enter value (Integer) for HashMap: ");
            int value = input.nextInt();
            input.nextLine(); 
            hashMap.put(key, value);
        }
        System.out.println("HashMap: " + hashMap);

        // Iterating over HashMap entries
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 7. Using Iterator to Iterate over ArrayList
        Iterator<String> iterator = arrayList.iterator();
        System.out.print("ArrayList (using Iterator): ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

       
        Object[] array = hashSet.toArray();
        System.out.println("HashSet to Array: " + Arrays.toString(array));
        
        input.close();
    }
}
