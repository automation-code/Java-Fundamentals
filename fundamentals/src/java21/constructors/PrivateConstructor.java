package java21.constructors;

public class PrivateConstructor {

    private PrivateConstructor() {
        System.out.println("Private constructor called");
    }

    public static PrivateConstructor createInstance() {
        return new PrivateConstructor();
    }

    public static void main(String[] args) {
        new PrivateConstructor();
        PrivateConstructor.createInstance();
    }
}
