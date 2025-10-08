package java21.exceptions;

public class ThrowBlock {

    // Throw keyword is used to create a custom error.

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 0;

        if (num2 == 0) {
            throw new ArithmeticException("Can't divide by zero");
        } else {
            System.out.println(num1 / num2);
        }
    }
}
