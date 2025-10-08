package java21.conditions;

public class IfElseCondition {

    public static void main(String[] args) {
        int number = 10;

        // Simple if statement
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // if-else-if ladder
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
