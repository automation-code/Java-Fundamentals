package java21.arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        // Declare and initialize a 2D array (array of arrays)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access and print elements of the 2D array
        System.out.println("Element at (0,0): " + matrix[0][0]);
        System.out.println("Element at (1,2): " + matrix[1][2]);

        // Modify an element in the 2D array
        matrix[2][1] = 88;
        System.out.println("Modified element at (2,1): " + matrix[2][1]);

        // Print all elements using nested loops
        System.out.println("All elements in the 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
