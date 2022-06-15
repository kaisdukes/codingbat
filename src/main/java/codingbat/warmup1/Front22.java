package codingbat.warmup1;

public class Front22 {

    public static String front22(final String str) {
        final var affix = str.length() < 2 ? str : str.substring(0, 2);
        return affix + str + affix;
    }
}