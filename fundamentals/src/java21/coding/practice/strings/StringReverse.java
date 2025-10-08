package java21.coding.practice.strings;

public class StringReverse {

    public static void main(String[] args) {
        String string = "Reverse This String";
        String reversedString = "";
        char ch;

        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            reversedString = ch + reversedString;
            ch++;
        }

        System.out.println("Original String: " + string);
        System.out.println("Reversed String: " + reversedString);
    }
}
