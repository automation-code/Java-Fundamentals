package java21.coding.practice.strings;

public class NonRepeatedChar {

    public static void main(String[] args) {
        String string = "ABACDCAB";
        String lowerCaseString = string.toLowerCase();
        char[] charArray = lowerCaseString.toCharArray();
        boolean found;

        System.out.println("Non-repeated characters in the string:");

        for (int i = 0; i < charArray.length; i++) {
            found = false;
            for (int j = 0; j < charArray.length; j++) {
                if (i != j && charArray[i] == charArray[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(charArray[i]);
            }
        }
    }
}
