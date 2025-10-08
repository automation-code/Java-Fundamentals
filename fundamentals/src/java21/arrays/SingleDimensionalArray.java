package java21.arrays;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Access and print elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modify an element in the array
        numbers[2] = 35;
        System.out.println("Modified third element: " + numbers[2]);

        // Print all elements using a loop
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
