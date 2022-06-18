package codingbat.string2;

public class CatDog {

    public static boolean catDog(final String str) {
        var cat = 0;
        var dog = 0;
        for (var i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) cat++;
            else if (str.startsWith("dog", i)) dog++;
        }
        return cat == dog;
    }
}