package codingbat.string3;

import static java.lang.Character.isDigit;
import static java.lang.Integer.parseInt;

public class SumNumbers {

    public static int sumNumbers(final String str) {
        var sum = 0;
        for (var i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                var count = 1;
                while (i < str.length() - 1 && isDigit(str.charAt(i + 1))) {
                    i++;
                    count++;
                }
                sum += parseInt(str.substring(i - count + 1, i + 1));
            }
        }
        return sum;
    }
}