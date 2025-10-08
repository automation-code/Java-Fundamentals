package java21.abstractions;

abstract class Programming {
    public abstract void htmlConcepts();

    public abstract void phpConcepts();

    public abstract void testingConcepts();
}

abstract class WebDesign extends Programming {
    public void htmlConcepts() {
        System.out.println("HTML is used for web design.");
    }
}

abstract class WebDevelop extends WebDesign {
    public void phpConcepts() {
        System.out.println("PHP is used for web development");
    }
}

class Testing extends WebDevelop {
    public void testingConcepts() {
        System.out.println("Software Testing");
    }
}

public class AbstractMethod {

    public static void main(String[] args) {

        Programming obj = new Testing();
        obj.htmlConcepts();
        obj.phpConcepts();
        obj.testingConcepts();
    }
}
