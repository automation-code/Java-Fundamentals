package java21.operators;

public class BitwiseOperators {

    public static void main(String[] args) {
        int a = 5;  // In binary: 0101
        int b = 3;  // In binary: 0011

        // Bitwise AND
        int andResult = a & b; // Result: 0001 (1 in decimal)
        System.out.println("Bitwise AND (5 & 3): " + andResult);

        // Bitwise OR
        int orResult = a | b; // Result: 0111 (7 in decimal)
        System.out.println("Bitwise OR (5 | 3): " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // Result: 0110 (6 in decimal)
        System.out.println("Bitwise XOR (5 ^ 3): " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // Result: ...11111010 (-6 in decimal, two's complement)
        System.out.println("Bitwise NOT (~5): " + notResult);

        // Left Shift
        int leftShiftResult = a << 1; // Result: 1010 (10 in decimal)
        System.out.println("Left Shift (5 << 1): " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 1; // Result: 0010 (2 in decimal)
        System.out.println("Right Shift (5 >> 1): " + rightShiftResult);

        // Unsigned Right Shift
        int unsignedRightShiftResult = a >>> 1; // Result: 0010 (2 in decimal)
        System.out.println("Unsigned Right Shift (5 >>> 1): " + unsignedRightShiftResult);
    }
}
