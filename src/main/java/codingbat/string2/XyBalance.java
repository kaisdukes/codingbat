package codingbat.string2;

public class XyBalance {

    public static boolean xyBalance(final String str) {
        var lastX = -1;
        var lastY = -1;
        for (var i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') lastX = i;
            else if (str.charAt(i) == 'y') lastY = i;
        }
        return lastX == -1 || lastY > lastX;
    }
}