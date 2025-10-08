package java21.inheritance;

class Addition {
    int a, b;
    int add(int a, int b) {
        this.a = a;
        this.b = b;
        return a + b;
    }
}

class Subtraction extends Addition{
    int sub(int a, int b) {
        this.a = a;
        this.b = b;
        return a - b;
    }
}

class Multiplication extends Subtraction {
    int mul(int a, int b) {
        this.a = a;
        this.b = b;
        return a * b;
    }
}

class Division extends Multiplication {
    int div(int a, int b) {
        this.a = a;
        this.b = b;
        return a / b;
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        Division obj = new Division();
        System.out.println("Addition: " + obj.add(10, 5));
        System.out.println("Subtraction: " + obj.sub(10, 5));
        System.out.println("Multiplication: " + obj.mul(10, 5));
        System.out.println("Division: " + obj.div(10, 5));
    }
}
