package codingbat.array2;

public class Sum13 {

    public static int sum13(final int[] nums) {
        var sum = 0;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 13) i++;
            else sum += nums[i];
        }
        return sum;
    }
}