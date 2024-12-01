public class SequenciaDeFib {

    private int fibonacci(int n) {
        int fibonacci = 0;
        if (n == 1 || n == 2)
            fibonacci = 1;
        else
            fibonacci = fibonacci(n - 1) + fibonacci(n - 2);

        return fibonacci;
    }
}
