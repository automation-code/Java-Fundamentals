package java21.coding.practice.arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 3, 7};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates:");

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
