package java21.keywords;

class Parent {
    void display(String msg) {
        System.out.println(msg);
    }
}


public class SuperKeyword extends Parent{

    SuperKeyword(){
        super.display("Hello from Parent class");
    }

    public static void main(String[] args) {
        System.out.println("Super Keyword Example");
        new SuperKeyword();
    }
}
