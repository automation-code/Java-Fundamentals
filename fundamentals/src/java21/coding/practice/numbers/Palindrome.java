package java21.coding.practice.numbers;

public class Palindrome {

    public static void main(String[] args) {
        int number = 45654;
        int sum = 0, remainder, temp;

        temp = number;
        while (number > 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }

        if (temp == sum) {
            System.out.println(temp + " is palindrome number");
        } else {
            System.out.println(temp + " is not palindrome number");
        }
    }
}
