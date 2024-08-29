package Week5;

interface MathOperations{
    int Operations(int a,int b);
}

public class LambdaExpression {

    public static void main(String[] args){
        MathOperations addition = (int a, int b)->a+b;

        MathOperations subtraction=(a, b)->a-b;

        MathOperations multiplication=(int a, int b)->{ return a * b;};

        MathOperations division=(int a, int b)->a/b;

        System.out.println("Addition :"+addition.Operations(20,30));
        System.out.println("Subtraction :"+subtraction.Operations(30,43));
        System.out.println("Multiplication :"+multiplication.Operations(20,12));
        System.out.println("Division :"+division.Operations(12,32));

    }

}
