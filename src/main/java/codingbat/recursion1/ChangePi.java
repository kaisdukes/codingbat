package codingbat.recursion1;

public class ChangePi {

    public static String changePi(final String str) {
        if (str.isEmpty()) return "";
        if (str.startsWith("pi")) return "3.14" + changePi(str.substring(2));
        return str.charAt(0) + changePi(str.substring(1));
    }
}