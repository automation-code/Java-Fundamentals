package java21.coding.practice.strings;

public class LengthWord {

    public static void main(String[] args) {
        String string = "Find The Length Of Each Word In A String";
        String[] words = string.split(" ");

        String largestWord = words[0];
        String smallestWord = words[0];

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            } else if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
        }

        System.out.println("Largest word: " + largestWord + " (Length: " + largestWord.length() + ")");
        System.out.println("Smallest word: " + smallestWord + " (Length: " + smallestWord.length() + ")");
    }
}
