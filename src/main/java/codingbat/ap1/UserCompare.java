package codingbat.ap1;

public class UserCompare {

    public static int userCompare(final String aName, final int aId, final String bName, final int bId) {
        final var compare = aName.compareTo(bName);
        if (compare < 0) return -1;
        if (compare > 0) return 1;
        if (aId < bId) return -1;
        if (aId > bId) return 1;
        return 0;
    }
}