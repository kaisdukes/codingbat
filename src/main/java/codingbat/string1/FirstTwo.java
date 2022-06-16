package codingbat.string1;

public class FirstTwo {

    public static String firstTwo(final String str) {
        return str.length() <= 2 ? str : str.substring(0, 2);
    }
}