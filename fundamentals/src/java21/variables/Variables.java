package java21.variables;

public class Variables {

    static int staticVar = 10;
    final int finalVar = 20;

    void localVariableMethod() {
        int localVar = 40;
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        int instanceVar = 30;
        Variables obj = new Variables();
        obj.localVariableMethod();

        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Final Variable: " + obj.finalVar);
    }
}
