package java21.datatypes;

public class TypeCasting {

    public static void main(String[] args) {

        int intValue = 100;
        // Implicit Type Casting (Widening)
        double doubleValue = intValue;
        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to Double: " + doubleValue);

        // Explicit Type Casting (Narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue;
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + anotherDoubleValue);
        System.out.println("Converted to Integer: " + anotherIntValue);
    }
}
