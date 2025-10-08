package java21.coding.practice.arrays;

public class ArrayMarge {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int length1 = array1.length;
        int length2 = array2.length;

        int[] mergedArray = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int j = 0; j < length2; j++) {
            mergedArray[length1 + j] = array2[j];
        }

        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
