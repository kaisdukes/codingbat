package codingbat.recursion1;

public class Count11 {

    public static int count11(final String str) {
        if (str.length() <= 1) return 0;
        return str.charAt(0) == '1' && str.charAt(1) == '1'
                ? 1 + count11(str.substring(2))
                : count11(str.substring(1));
    }
}