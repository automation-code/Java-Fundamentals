package java21.strings;

public class StringClass {

    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!");

        // Comparing strings
        System.out.println("Using '==': " + (str1 == str2)); // false, compares references
        System.out.println("Using 'equals()': " + str1.equals(str2)); // true, compares values

        // String methods
        System.out.println("Length: " + str1.length());
        System.out.println("Substring: " + str1.substring(7, 12));
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Index of 'World': " + str1.indexOf("World"));
        System.out.println("Replace: " + str1.replace("World", "Java"));

        // String concatenation
        String str3 = str1 + " Welcome to Java.";
        System.out.println("Concatenated String: " + str3);
    }
}
