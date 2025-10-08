package java21.interfaces;

interface InterfaceA{
    int alpha = 100;
    void display();
}

interface InterfaceB{
    default void displayWithData(){
        System.out.println("Display with Data");
    }
}

public class MultipleInterface implements InterfaceA, InterfaceB{

    public void display(){
        System.out.println("This is display Method");
    }

    public static void main(String[] args) {
        MultipleInterface obj = new MultipleInterface();
        System.out.println(MultipleInterface.alpha);
        obj.display();
        obj.displayWithData();
    }
}
