package java21.coding.practice.numbers;

public class Fibonacci {

    public static void main(String[] args) {
        int term = 10;
        int num1 = 0, num2 = 1, num3;

        for (int i = 1; i <= term; i++) {
            System.out.println(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
