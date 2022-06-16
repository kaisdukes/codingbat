package codingbat.string1;

public class SeeColor {

    public static String seeColor(final String str) {
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }
}