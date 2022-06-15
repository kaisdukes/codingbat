package codingbat.warmup1;

public class DelDel {

    public static String delDel(final String str) {
        return str.length() > 3 && str.substring(1, 4).equals("del")
                ? str.charAt(0) + str.substring(4)
                : str;
    }
}