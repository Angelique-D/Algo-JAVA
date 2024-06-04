public class Exercice23 {


    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciIterative(i) + " ");
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int current = 1, previous = 0, result = 0;
        for (int i = 2; i <= n; i++) {
            result = previous + current;
            previous = current;
            current = result;
        }return result;
    }
}
