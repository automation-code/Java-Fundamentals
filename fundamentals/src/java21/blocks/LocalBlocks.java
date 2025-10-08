package java21.blocks;

public class LocalBlocks {

    public static void main(String[] args) {
        int x = 10;

        {
            int y = 20;
            System.out.println("Inside block: " + (x + y));
        }

        System.out.println("Outside block: " + x);
    }
}
