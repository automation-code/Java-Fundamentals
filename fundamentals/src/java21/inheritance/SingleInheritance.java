package java21.inheritance;


class ClassA {
    void display(int a) {
        System.out.println("ClassA: " + a);
    }
}

class ClassB extends ClassA {
    void display(String b) {
        System.out.println("ClassB: " + b);
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        ClassB obj = new ClassB();
        obj.display(10);
        obj.display("Hello");
    }
}
