package codingbat.string1;

public class ExtraFront {

    public static String extraFront(final String str) {
        final var front = str.length() <= 2 ? str : str.substring(0, 2);
        return front + front + front;
    }
}