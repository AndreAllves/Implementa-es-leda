public class Fatorial {
    public static void main(String[] args) {

    }

    private int fatorial(int n) {
        int f = 0;

        if (n == 0)
            f = 1;

        else
            f = n * fatorial(n - 1);

        return f;
    }
 }