package codingbat.recursion1;

public class BunnyEars {

    public static int bunnyEars(final int bunnies) {
        return bunnies == 0 ? 0 : 2 + bunnyEars(bunnies - 1);
    }
}