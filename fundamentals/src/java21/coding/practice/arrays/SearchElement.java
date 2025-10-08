package java21.coding.practice.arrays;

public class SearchElement {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int elementToSearch = 70;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                found = true;
                System.out.println("Element " + elementToSearch + " found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + elementToSearch + " not found in the array.");
        }
    }
}
