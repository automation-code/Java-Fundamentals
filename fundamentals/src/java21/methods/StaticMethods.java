package java21.methods;

public class StaticMethods {

    static void displayMessage() {
        System.out.println("Hello from a static method!");
    }

    static void showNumber(int number) {
        System.out.println("The number is: " + number);
    }

    static void addNumbers(int a, int b) {
        System.out.println("The sum is: " + (a + b));
    }

    public static void main(String[] args) {
        displayMessage();
        showNumber(42);
        addNumbers(5, 10);
    }
}
