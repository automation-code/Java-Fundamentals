package java21.coding.practice.arrays;

public class ArrayEqual {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean areEqual = true;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                areEqual = false;
                break;
            }
        }

        if (areEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }
    }
}
