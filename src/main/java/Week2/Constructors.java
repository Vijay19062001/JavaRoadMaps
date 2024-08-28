package Week2;

public class Constructors {
	String name;
	int age;
	
	//Parameterized constructors
	public Constructors(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	//Default constructor
	public Constructors() {
		this.name = "Vijay";
		this.age= 12;
	}
	
	public void displayInfo() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}

	public static void main(String[] args) {
		
		Constructors person=new Constructors("Hari",20);
		
		Constructors persons = new Constructors();
		
		person.displayInfo();
		persons.displayInfo();

	}

}
