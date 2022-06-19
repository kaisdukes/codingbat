package codingbat.ap1;

public class HasOne {

    public static boolean hasOne(int n) {
        while (n != 0) {
            if (n % 10 == 1) return true;
            n /= 10;
        }
        return false;
    }
}