package java21.constructors;

public class ParameterizedConstructor {

    ParameterizedConstructor(int x) {
        System.out.println("Parameterized Constructor called with value: " + x);
    }

    ParameterizedConstructor(int x, int y) {
        System.out.println("Parameterized Constructor called with values: " + (x + y));
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor(10);
        ParameterizedConstructor obj2 = new ParameterizedConstructor(10, 20);
    }
}
