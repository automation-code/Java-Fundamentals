package java21.coding.practice.strings;

public class FirstCharInEachWord {

    public static void main(String[] args) {
        String string = "Find The First Character In Each Word";
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != ' ' && (i==0 || chars[i-1] == ' ')) {
                System.out.println("First character in each word: " + chars[i]);
            }
        }
    }
}
