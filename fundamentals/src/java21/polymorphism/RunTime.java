package java21.polymorphism;

class Alpha{
    String string = "RunTime - MethodOverriding";
    void display(){
        System.out.println("Class Alpha - Method Overriding");
    }
}

class Beta extends Alpha{
    @Override
    void display(){
        System.out.println("Class Beta - Method Overriding");
    }
}

public class RunTime {

    public static void main(String[] args) {
        Alpha obj1 = new Alpha();
        System.out.println(obj1.string);
        obj1.display();
        Beta obj2 = new Beta();
        obj2.display();
    }
}
