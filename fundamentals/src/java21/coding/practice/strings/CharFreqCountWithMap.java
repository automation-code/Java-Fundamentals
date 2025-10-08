package java21.coding.practice.strings;

import java.util.HashMap;
import java.util.Map;

public class CharFreqCountWithMap {

    public static void main(String[] args) {
        String string = "Character Frequency Counting With Map";
        String lowerCaseString = string.toLowerCase();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : lowerCaseString.toCharArray()) {
            if (c != ' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character Frequency in the String");

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
