package codingbat.recursion1;

public class ParenBit {

    public static String parenBit(final String str) {
        var a = 0;
        var match = true;
        if (str.charAt(0) != '(') {
            match = false;
            a++;
        }
        var b = str.length() - 1;
        if (str.charAt(b) != ')') {
            match = false;
            b--;
        }
        return match ? str : parenBit(str.substring(a, b + 1));
    }
}