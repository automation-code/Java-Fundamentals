package java21.coding.practice.strings;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharWithMap {

    public static void main(String[] args) {
        String string = "ABACDCAB";
        String lowerCaseString = string.toLowerCase();
        char[] charArray = lowerCaseString.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : charArray) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Non-repeated characters in the string:");

        for (char c : charArray) {
            if (charCountMap.get(c) == 1) {
                System.out.println(c);
            }
        }
    }
}
