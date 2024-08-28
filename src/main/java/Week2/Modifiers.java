package Week2;

public class Modifiers {
   
    public int data = 12;

    // Public method 
    public void display() {
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {
       
        Modifiers obj = new Modifiers();
        obj.display(); // Calling the display method
    }

    //protected access modifier
    class MyClass {
       
        protected int data = 10;

        //Accessible within the package and in subclasses
        protected void display() {
            System.out.println("MyClass Data: " + data);
        }
    }

   
    class SubClass extends MyClass {
        // protected
        void modifyData() {
            data = 20; 
            display(); 
        }
    }

   
    class DefaultClass {
        
        int data = 10; // Package-private

        void display() {
            System.out.println("DefaultClass Data: " + data);
        }
    }

    
    class PrivateClass {
       
        private int data = 10;

        //(Accessible only within PrivateClass)
        private void display() {
            System.out.println("PrivateClass Data: " + data);
        }

      
        public void accessPrivateData() {
            display();
        }
    }
}
