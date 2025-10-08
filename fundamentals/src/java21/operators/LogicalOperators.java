package java21.operators;

public class LogicalOperators {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        System.out.println("Logical AND:");
        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a & b: " + (a & b));   // false

        // Logical OR
        System.out.println("\nLogical OR:");
        System.out.println("a || b: " + (a || b)); // true
        System.out.println("a | b: " + (a | b));   // true

        // Logical NOT
        System.out.println("\nLogical NOT:");
        System.out.println("!a: " + (!a)); // false
        System.out.println("!b: " + (!b)); // true

        // Short-circuit evaluation
        System.out.println("\nShort-circuit evaluation:");
        int x = 0;
        boolean result = (x > 0) && (++x > 0); // x is not incremented because the first condition is false
        System.out.println("Result: " + result); // false
        System.out.println("x after short-circuit AND: " + x); // 0

        result = (x > 0) || (++x > 0); // x is incremented because the first condition is false
        System.out.println("Result: " + result); // true
        System.out.println("x after short-circuit OR: " + x); // 1
    }
}
