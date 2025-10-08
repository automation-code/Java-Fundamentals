package java21.coding.practice.strings;

public class DuplicateWords {

    public static void main(String[] args) {
        String string = "Java is a programming language. Java is also an island of Indonesia. Java is widely used language";
        String[] words = string.toLowerCase().split("\\W+");
        int count;

        System.out.println("Duplicate words in the given string:");

        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }

            if (count > 1 && !words[i].equals("0")) {
                System.out.println(words[i] + ": " + count);
            }
        }
    }
}
