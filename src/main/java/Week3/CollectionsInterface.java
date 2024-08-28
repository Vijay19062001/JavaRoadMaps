package Week3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Vector;
public class CollectionsInterface {
	

	    public static void main(String[] args) {
	    	//Array List
	    	Collection<String>list = new ArrayList<>();
	    	
	    	list.add("Arun");
	    	list.add("Bobby");
	    	list.add("Chandru");
	    	list.add("Daniel");
	    	
	    	System.out.println("List all Elements :"+list);
	    	
	    	if(list.contains("Daniel")) {
	    		System.out.println("List contains daniel");
	    	}
	    	
	    	list.remove("Chandru");
	    	
	    	System.out.println("Updated list Elements");
	    	
	    	for(String name:list) {
	    		System.out.println(name);
	    	}
	    	 System.out.println("Size of list: " + list.size());
	    
	    	
	    	//HashSet
	    	
	    	HashSet<String>set = new HashSet<>();
	    	
	    	set.add("Charlie");
	    	set.add("Charu");
	    	set.add("Chan");
	    	set.add("Mano");
	    	
	    	System.out.println("set Elements :"+set);
	    	

	    	if(set.contains("Daniel")) {
	    		System.out.println("set contains daniel");
	    	}
	    	else {
	    		System.out.println("set did not contains daniel");
	    	}
	    	
	    	//LinkedHashSet
	    LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("google");
        lhs.add("Is");
        lhs.add("search");
        lhs.add("Is");
        lhs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
	    	
        //Priority Queue
        
        PriorityQueue<Integer> pQueue  = new PriorityQueue<Integer>();

    pQueue.add(10);
    pQueue.add(20);
    pQueue.add(15);

    
    System.out.println(pQueue);

    // Printing the top element of PriorityQueue
    System.out.println(pQueue.peek());

    // Printing the top element and removing it
    System.out.println(pQueue.poll());

    // Printing the top element again
    System.out.println(pQueue.peek());
        
        
    //Stack
    
    Stack<String> stack = new Stack<>();
    stack.push("This");
    stack.push("is");
    stack.push("java");
    stack.push("name");

    Iterator<String> itrs = stack.iterator();

    // Printing the stack
    while (itrs.hasNext()) {
        System.out.print(itrs.next() + " ");
    }

    System.out.println();

    stack.pop();

    itrs = stack.iterator();

    while (itrs.hasNext()) {
        System.out.print(itrs.next() + " ");
    }
    
    
    //Vector
    
    Vector<Integer> v = new Vector<Integer>();

    
    for (int i = 1; i <= 5; i++)
        v.add(i);

    System.out.println(v);

    v.remove(3);

    System.out.println(v);

    
	    }
}        
