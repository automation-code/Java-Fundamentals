package java21.coding.practice.strings;

public class CountVowelConsonant {

    public static void main(String[] args) {
        String string = "Count Vowels And Consonants In A String";
        String lowerCaseString = string.toLowerCase();
        char[] chars = lowerCaseString.toCharArray();
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Total number of vowels: " + vowelCount);
        System.out.println("Total number of consonants: " + consonantCount);
    }
}
