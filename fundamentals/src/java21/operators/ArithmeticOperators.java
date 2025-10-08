package java21.operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: Sum: 13

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference); // Output: Difference: 7

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product); // Output: Product: 30

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // Output: Quotient: 3

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // Output: Remainder: 1

        // Pre Increment - Increment a before using it
        ++a;
        System.out.println("Pre Incremented a: " + a); // Output: Incremented a: 11

        // Post Increment - Use a then increment
        a++;
        System.out.println("Post Incremented a: " + a); // Output: Incremented a: 12

        // Pre Decrement - Decrement b before using it
        --b;
        System.out.println("Pre Decremented b: " + b); // Output: Decremented b: 2

        // Post Decrement - Use b then decrement
        b--;
        System.out.println("Post Decremented b: " + b); // Output: Decremented b: 1

    }
}
