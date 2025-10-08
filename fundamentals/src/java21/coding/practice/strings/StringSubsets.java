package java21.coding.practice.strings;

public class StringSubsets {

    public static void main(String[] args) {

        String string = "Fun";
        int len = string.length();
        int temp = 0;
        String [] strArray = new String[len * (len + 1) / 2];

        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                strArray[temp] = string.substring(i, j + 1);
                temp++;
            }
        }

        for (int k = 0; k < strArray.length; k++) {
            System.out.println(strArray[k]);
        }
    }
}
