package java21.blocks;

public class StaticBlocks {

    static {
        System.out.println("Static block executed");
    }

    public StaticBlocks() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        new StaticBlocks();
    }
}
