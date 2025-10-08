package java21.operators;

public class AssignmentOperators {

    public static void main(String[] args) {
        int a = 10;

        // Simple assignment
        a = 20;

        // Compound assignment
        a += 5; // a is now 25 (a = a + 5)
        System.out.println("a after += 5: " + a);
        a -= 3; // a is now 22 (a = a - 3)
        System.out.println("a after -= 3: " + a);
        a *= 2; // a is now 44 (a = a * 2)
        System.out.println("a after *= 2: " + a);
        a /= 4; // a is now 11 (a = a / 4)
        System.out.println("a after /= 4: " + a);
        a %= 3; // a is now 2 (a = a % 3)
        System.out.println("a after %= 3: " + a);

        System.out.println("Final value of a: " + a);

    }
}
