package java21.objects;

class ClassA {
    int a;
    int b;

    ClassA(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class Objects {

    public static void main(String[] args) {
        ClassA obj1 = new ClassA(10, 20);
        ClassA obj2 = new ClassA(30, 40);

        // Comparing references
        System.out.println("obj1 == obj2: " + (obj1 == obj2)); // false

        // Comparing values
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // false

        // Printing hash codes
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());

        // Printing string representations
        System.out.println("obj1.toString(): " + obj1.toString());
        System.out.println("obj2.toString(): " + obj2.toString());
    }
}
