package codingbat.string3;

public class CountYZ {

    public static int countYZ(final String str) {
        var count = 0;
        for (var i = 0; i < str.length(); i++) {
            final var nextLetter = i < str.length() - 1 && Character.isLetter(str.charAt(i + 1));
            final var ch = str.charAt(i);
            final var yOrZ = ch == 'y' || ch == 'Y' || ch == 'z' || ch == 'Z';
            if (yOrZ && !nextLetter) count++;
        }
        return count;
    }
}