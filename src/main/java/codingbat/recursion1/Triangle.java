package codingbat.recursion1;

public class Triangle {

    public static int triangle(final int rows) {
        return rows == 0 ? 0 : rows + triangle(rows - 1);
    }
}