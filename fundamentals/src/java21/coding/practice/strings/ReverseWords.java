package java21.coding.practice.strings;

public class ReverseWords {

    public static void main(String[] args) {
        String string = "java code";
        String words[] = string.split(" ");

        for (String word : words) {
            String reword = " ";
            for (int i = word.length() - 1; i >= 0; i--) {
                reword = reword + word.charAt(i);
            }
            System.out.print(reword);
        }
    }
}
