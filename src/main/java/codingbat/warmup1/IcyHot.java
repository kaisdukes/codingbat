package codingbat.warmup1;

public class IcyHot {

    public static boolean icyHot(final int temp1, final int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }
}