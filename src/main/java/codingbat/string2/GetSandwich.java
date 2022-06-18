package codingbat.string2;

public class GetSandwich {

    public static String getSandwich(final String str) {
        final var i1 = str.indexOf("bread");
        if (i1 == -1) return "";
        final var i2 = str.lastIndexOf("bread");
        if (i2 == -1 || i1 == i2) return "";
        return str.substring(i1 + 5, i2);
    }
}