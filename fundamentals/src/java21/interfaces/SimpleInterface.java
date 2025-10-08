package java21.interfaces;

interface Shape{
    void round();

    default void square(){
        System.out.println("This is round shape");
    }

    static void ractangle(){
        System.out.println("This is ractangle shape");
    }
}

public class SimpleInterface implements Shape{

    public void round(){
        System.out.println("This is circle shape");
    }

    public static void main(String[] args) {
        SimpleInterface obj = new SimpleInterface();
        obj.square();
        obj.round();
        Shape.ractangle();
    }
}
