package java21.coding.practice.numbers;

public class Armstrong {

    public static void main(String[] args) {
        int number = 153;
        int remainder, temp, arm = 0;

        temp = number;
        while (number > 0) {
            remainder = number % 10;
            arm = (remainder * remainder * remainder) + arm;
            number = number / 10;
        }

        if (temp == arm) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}
