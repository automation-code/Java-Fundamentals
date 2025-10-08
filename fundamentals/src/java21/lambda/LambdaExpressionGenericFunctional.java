package java21.lambda;

@FunctionalInterface
interface GenericFunction<T> {
    T operate(T a, T b);
}

public class LambdaExpressionGenericFunctional {

    public static void main(String[] args) {
        GenericFunction<String> concat = (a, b) -> a + b;
        GenericFunction<Integer> add = (a, b) -> a + b;

        System.out.println(concat.operate("Hello ", "Java")); // Hello Java
        System.out.println(add.operate(5, 10));
    }
}
