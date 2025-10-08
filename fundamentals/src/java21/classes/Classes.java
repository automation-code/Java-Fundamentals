package java21.classes;

public class Classes {

    int outerField;
    class InnerClass{
        void display(){
            System.out.println("Outer field: " + outerField);
        }
    }

    public static void main(String[] args) {
        Classes outer = new Classes();
        outer.outerField = 10;

        Classes.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
