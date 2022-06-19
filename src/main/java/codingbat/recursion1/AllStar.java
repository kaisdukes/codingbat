package codingbat.recursion1;

public class AllStar {

    public static String allStar(final String str) {
        return str.length() <= 1 ? str : str.charAt(0) + "*" + allStar(str.substring(1));
    }
}