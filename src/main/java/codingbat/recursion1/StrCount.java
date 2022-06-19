package codingbat.recursion1;

public class StrCount {

    public static int strCount(final String str, final String sub) {
        if (str.length() < sub.length()) return 0;
        return str.startsWith(sub)
                ? 1 + strCount(str.substring(sub.length()), sub)
                : strCount(str.substring(1), sub);
    }
}