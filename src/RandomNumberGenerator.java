import java.util.Random;

public class RandomNumberGenerator {

    public static int generateRandomNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Invalid interval: min must be less than max");
        }

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}
