package codingbat.string1;

public class AtFirst {

    public static String atFirst(final String str) {
        switch (str.length()) {
            case 0:
                return "@@";
            case 1:
                return str.charAt(0) + "@";
            default:
                return str.substring(0, 2);
        }
    }
}