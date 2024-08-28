package Week3;

import java.util.*;

class Book{
	int id;
	String name, author, publisher;
	int quantity;
	
	public Book(int id,String name,String author, String publisher, int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
	    this.quantity=quantity;
	}
}

public class LinkedHashMaps {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		LinkedHashMap<Integer,Book>lhm=new LinkedHashMap<>();
		
		System.out.print("Enter the number of books :");
		int numberOfBooks = input.nextInt();
		
		for(int i=1; i<=numberOfBooks; i++) {
			System.out.println("Enter the details for book "+i+":");
			
			System.out.println("Enter the book Id :");
			int id =input.nextInt();
			input.nextLine();
			
			System.out.println("Enter the book name :");
			String name =input.nextLine();
			
			System.out.println("Enter the author name :");
			String author =input.nextLine();
			
			System.out.println("Enter the publisher name :");
			String publisher =input.nextLine();
			
			System.out.println("Enter the book quantity :");
			int quantity =input.nextInt();
			
			
			Book book = new Book( id, name, author, publisher, quantity);
			
			lhm.put(i, book);
			
		}
		
		for(Map.Entry<Integer, Book> entry : lhm.entrySet()) {
			 int key = entry.getKey();
	            Book b = entry.getValue();
	            System.out.println("\nBook " + key + " Details:");
	            System.out.println("ID: " + b.id);
	            System.out.println("Name: " + b.name);
	            System.out.println("Author: " + b.author);
	            System.out.println("Publisher: " + b.publisher);
	            System.out.println("Quantity: " + b.quantity);
	        }
		input.close();
		}
	
	
		
	}


