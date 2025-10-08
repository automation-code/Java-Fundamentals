package java21.operators;

public class TernaryOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Using ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("Maximum value is: " + max);

        // Using ternary operator to check if a number is even or odd
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
}
