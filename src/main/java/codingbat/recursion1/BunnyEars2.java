package codingbat.recursion1;

public class BunnyEars2 {

    public static int bunnyEars2(final int bunnies) {
        if (bunnies == 0) return 0;
        return (bunnies % 2 == 0 ? 3 : 2) + bunnyEars2(bunnies - 1);
    }
}