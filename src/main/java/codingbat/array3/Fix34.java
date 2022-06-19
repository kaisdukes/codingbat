package codingbat.array3;

public class Fix34 {

    public static int[] fix34(final int[] nums) {
        var index4 = -1;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (var j = index4 + 1; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        index4 = j;
                        break;
                    }
                }
                var temp = nums[i + 1];
                nums[i + 1] = nums[index4];
                nums[index4] = temp;
            }
        }
        return nums;
    }
}