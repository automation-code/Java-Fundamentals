package java21.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(100, "A");
        treeMap.put(200, "B");
        treeMap.put(300, "C");

        // Allow only unique value
        treeMap.put(200, "B");

        // Not allow null key but contains multiple null value
        treeMap.put(400, null);
        treeMap.put(500, null);

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
