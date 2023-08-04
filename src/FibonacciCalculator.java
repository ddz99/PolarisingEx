public class FibonacciCalculator {

    public static long[] generateFibonacciArray(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input: n must be a positive integer.");
        }

        long[] fibonacciArray = new long[n];
        fibonacciArray[0] = 0;
        if (n > 1) {
            fibonacciArray[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        return fibonacciArray;
    }

}

