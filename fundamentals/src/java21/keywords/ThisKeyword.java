package java21.keywords;

public class ThisKeyword {

    int alpha, beta;

    ThisKeyword(int alpha, int beta) {
        this.alpha = alpha;
        this.beta = beta;
        System.out.println("Constructor called: " + (alpha + beta));
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(10, 20);
    }
}
