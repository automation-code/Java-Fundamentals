package java21.coding.practice.arrays;

public class FreqElement {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};
        int[] freq = new int[array.length];
        boolean[] visited = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (visited[i]) {
                continue;
            }
            freq[i] = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    freq[i]++;
                    visited[j] = true;
                }
            }
        }

        System.out.println("Element Frequency in the Array:");
        for (int i = 0; i < freq.length; i++) {
            if (!visited[i]) {
                System.out.println(array[i] + " : " + freq[i]);
            }
        }
    }
}
