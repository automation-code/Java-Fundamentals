package java21.coding.practice.strings;

public class ReplaceChar {

    public static void main(String[] args) {
        String string = "opentextopentext";
        char charToReplace = 'e';

        string.indexOf(charToReplace);

        int count = 1;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == charToReplace) {
                string = string.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
                count++;
            }
        }
        System.out.println(string);
    }
}
