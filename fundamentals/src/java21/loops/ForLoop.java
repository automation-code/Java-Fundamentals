package java21.loops;

public class ForLoop {

    public static void main(String[] args) {
        // Basic for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Enhanced for loop (for-each loop)
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
