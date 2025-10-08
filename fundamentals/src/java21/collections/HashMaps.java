package java21.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Alpha");
        map.put(2, "Beta");
        map.put(3, "Gamma");

        // Allow only one null key and multiple null values

        map.put(null, "Google");
        map.put(4, null);
        map.put(5, null);

        System.out.println(map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
