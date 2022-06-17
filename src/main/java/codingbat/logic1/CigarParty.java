package codingbat.logic1;

public class CigarParty {

    public static boolean cigarParty(final int cigars, final boolean isWeekend) {
        return cigars >= 40 && (isWeekend || cigars <= 60);
    }
}