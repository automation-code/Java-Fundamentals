package java21.coding.practice.strings;

public class CharFreqCount {

    public static void main(String[] args) {
        String string = "Character Frequency Counting";
        String lowerCaseString = string.toLowerCase();
        char [] charCount = lowerCaseString.toCharArray();
        int [] count = new int[charCount.length];

        for (int i = 0; i < charCount.length; i++) {
            count[i] = 1;
            for (int j = i + 1; j < charCount.length; j++) {
                if (charCount[i] == charCount[j] && charCount[i] != ' ' && charCount[i] != '0') {
                    count[i]++;
                    charCount[j] = '0';
                }
            }
        }

        System.out.println("Character Frequency in the String");

        for (int i = 0; i < count.length; i++) {
            if (charCount[i] != ' ' && charCount[i] != '0') {
                System.out.println(charCount[i] + " : " + count[i]);
            }
        }
    }
}
