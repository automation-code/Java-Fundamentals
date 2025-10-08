package java21.constructors;

public class CopyConstructor {

    int alpha, beta;

    CopyConstructor(int alpha, int beta){
        this.alpha = alpha;
        this.beta = beta;
        System.out.println(alpha+beta);
    }

    CopyConstructor(CopyConstructor obj){
        alpha = obj.alpha;
        beta = obj.beta;
        System.out.println(alpha+beta);
    }

    public static void main(String[] args) {
        new CopyConstructor(100, 300);
    }
}
