package java21.methods;

class Parent {
    public final void show() {
        System.out.println("This is a final method in Parent class.");
    }
}

public class FinalMethods {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show();
    }
}
