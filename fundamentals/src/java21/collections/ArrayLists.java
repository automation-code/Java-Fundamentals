package java21.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Add element in the list
        list.add("Hello");
        list.add("World");

        // Allow multiple null value in the list
        list.add(null);
        list.add(null);

        // Allow duplicate element in the list
        list.add("World");

        System.out.println(list);

        // Change the element in the list
        list.set(3, "Java");

        System.out.println(list);
    }
}
