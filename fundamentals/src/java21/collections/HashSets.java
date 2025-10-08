package java21.collections;

import java.util.HashSet;

public class HashSets {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("Hello1");
        set.add("Hello2");
        set.add("Hello3");

        // Allow only null value
        set.add(null);
        set.add(null);

        // Not allow duplicate value
        set.add("Hello1");

        System.out.println(set);

        set.remove("Hello1");

        for (String item : set){
            System.out.println(item);
        }
    }
}
