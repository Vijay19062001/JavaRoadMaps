public class Array {

    public static void main(String[] args) {
        // Single Dimensional Array
        int arr[] = {3, 5, 4, 2};


        System.out.println("1D Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");




        // Multi-Dimensional Array (2D Array)
        int arr2D[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};


        System.out.println("2D Array Elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}