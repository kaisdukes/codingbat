package codingbat.string3;

public class GHappy {

    public static boolean gHappy(final String str) {
        for (var i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                var count = 0;
                do {
                    i++;
                    count++;
                } while (i < str.length() && str.charAt(i) == 'g');
                if (count == 1) return false;
            }
        }
        return true;
    }
}