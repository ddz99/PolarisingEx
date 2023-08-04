public class PolarisingSimu {

    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        int n = RandomNumberGenerator.generateRandomNumber(min, max);

        long[] sequence = FibonacciCalculator.generateFibonacciArray(n);
        //can theoretically go up to 9,223,372,036 Billion (safe checks?), n 94 breaks it

        System.out.print("Fibonacci sequence up to " + n + ": ");
        for (long l : sequence) {
            System.out.print(l + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < sequence.length; i++) {
            //if prime num -> print
            if (PrimeChecker.isPrime(sequence[i]))
                System.out.println(sequence[i] + " - Upgrade base at year " + i);
        }


    }
}
