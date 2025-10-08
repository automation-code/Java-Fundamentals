package java21.coding.practice.strings;

public class RemoveDuplicateChar {

    public static void main(String[] args) {
        String string = "Programming in Java";
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = string.toCharArray();
        boolean found;

        for (int i = 0; i < charArray.length; i++) {
            found = false;
            for (int j = i+1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                stringBuilder.append(charArray[i]);
            }
        }

        System.out.println("String after removing duplicate characters: " + stringBuilder.toString());
    }
}
