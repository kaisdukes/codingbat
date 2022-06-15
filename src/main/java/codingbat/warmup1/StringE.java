package codingbat.warmup1;

public class StringE {

    public static boolean stringE(final String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
                if (count > 3) return false;
            }
        }
        return count > 0;
    }
}