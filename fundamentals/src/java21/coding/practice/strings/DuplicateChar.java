package java21.coding.practice.strings;

public class DuplicateChar {

    public static void main(String[] args) {
        String string = "Find Duplicate Characters";
        String lowerCaseString = string.toLowerCase();
        char[] charArray = lowerCaseString.toCharArray();
        int count = 0;

        System.out.println("Duplicate characters in the given string:");

        for (int i = 0; i < string.length(); i++) {
            count = 1;
            for (int j = i + 1; j < string.length(); j++) {
                if (charArray[i] == charArray[j] && charArray[i] != ' ' && charArray[i] != '0') {
                    System.out.println(charArray[i]);
                    count++;
                    break;
                }
            }
        }
    }
}
