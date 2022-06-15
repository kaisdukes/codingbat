package codingbat.warmup1;

public class MixStart {

    public static boolean mixStart(final String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }
}