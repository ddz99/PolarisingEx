public class PrimeChecker {

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        if (number == 2) {
            return true; // 2 is a prime number
        }

        // If the number is even (except 2), it's not prime
        if (number % 2 == 0) {
            return false;
        }

        // Check for divisibility by odd numbers starting from 3 up to the square root of the number
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false; // If the number is divisible by any odd number, it's not prime
            }
        }

        return true; // If no divisors are found, the number is prime
    }
}