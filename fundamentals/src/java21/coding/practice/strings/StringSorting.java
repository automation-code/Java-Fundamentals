package java21.coding.practice.strings;

public class StringSorting {

    public static void main(String[] args) {

        String string = "programming";
        char [] charArray = string.toCharArray();
        char temp;

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        System.out.println(charArray);
    }
}
