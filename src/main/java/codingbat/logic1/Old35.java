package codingbat.logic1;

public class Old35 {

    public static boolean old35(final int n) {
        final var multipleOf3 = n % 3 == 0;
        final var multipleOf5 = n % 5 == 0;
        return (multipleOf3 && !multipleOf5) || (!multipleOf3 && multipleOf5);
    }
}