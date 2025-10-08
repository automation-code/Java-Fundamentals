package java21.coding.practice.strings;

public class CharCount {

    public static void main(String[] args) {
        String string = "Characters counting example";
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch != ' ') {
                count++;
            }
        }
        System.out.println("Total characters (excluding spaces): " + count);
    }
}
