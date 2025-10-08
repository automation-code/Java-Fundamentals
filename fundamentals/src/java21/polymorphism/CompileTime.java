package java21.polymorphism;

public class CompileTime {

    String string = "CompileTime - Method Overloading";

    void display(){
        System.out.println("This is compile time polymorphism method");
    }

    void display(int number){
        System.out.println("Your number is: " + number);
    }

    public static void main(String[] args) {
        CompileTime obj = new CompileTime();
        System.out.println(obj.string);
        obj.display();
        obj.display(100);
    }
}
