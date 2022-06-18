package codingbat.string3;

public class EqualIsNot {

    public static boolean equalIsNot(final String str) {
        var countIs = 0;
        var countNot = 0;
        for (var i = 0; i < str.length(); i++) {
            if (str.startsWith("is", i)) countIs++;
            else if (str.startsWith("not", i)) countNot++;
        }
        return countIs == countNot;
    }
}