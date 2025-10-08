package java21.coding.practice.strings;

public class CharConversion {

    public static void main(String[] args) {
        String string = "cHARACTER cONVERSION pROGRAM tO cONVERT uPPER tO lOWER cASE aND lOWER tO uPPER cASE";
        StringBuffer stringBuffer = new StringBuffer(string);

        for(int i = 0; i < stringBuffer.length(); i++) {
            char ch = stringBuffer.charAt(i);
            if (Character.isLowerCase(ch)) {
                stringBuffer.setCharAt(i, Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                stringBuffer.setCharAt(i, Character.toLowerCase(ch));
            }
        }

        System.out.println("Converted String: " + stringBuffer);
    }
}
