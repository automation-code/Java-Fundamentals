package java21.collections;

import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(300);

        // Not allow duplicate value
        treeSet.add(200);

        for (Integer number : treeSet){
            System.out.println(number);
        }

    }
}
