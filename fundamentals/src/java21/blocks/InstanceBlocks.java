package java21.blocks;

public class InstanceBlocks {

    int x, y;

    InstanceBlocks(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Constructor executed: " + (x + y));
    }

    {
        int alphaVal = 100;
        int betaVal = 200;
        System.out.println("Instance block executed: " + (alphaVal + betaVal));
    }


    public static void main(String[] args) {
        new InstanceBlocks(1, 2);
    }
}
