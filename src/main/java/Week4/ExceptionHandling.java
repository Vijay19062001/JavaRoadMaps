package Week4;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            int a[] = {1,2,3,4,5,6};  
            int result = a[3]/ 0;  
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);

        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("Rest of the code!");
    }
}
