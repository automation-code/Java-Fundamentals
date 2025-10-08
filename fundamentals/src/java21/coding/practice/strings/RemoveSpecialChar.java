package java21.coding.practice.strings;

public class RemoveSpecialChar {

    public static void main(String[] args) {
        String string = "fghjkl!@#$%^&dfghjkl@#$%^&*(dfghjkjhgc_)(*&^%$##$%^&*(dfghjklghjklfghjk";
        String replacedString = string.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Original String: " + string);
        System.out.println("String after replacing special characters: " + replacedString);
    }
}
