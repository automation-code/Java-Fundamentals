package java21.exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        try {
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception error");
        } finally {
            System.out.println("Always executed");
        }
    }
}
