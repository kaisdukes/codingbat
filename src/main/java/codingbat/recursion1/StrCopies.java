package codingbat.recursion1;

public class StrCopies {

    public static boolean strCopies(final String str, final String sub, final int n) {
        return str.length() < sub.length()
                ? n == 0
                : strCopies(str.substring(1), sub, str.startsWith(sub) ? n - 1 : n);
    }
}