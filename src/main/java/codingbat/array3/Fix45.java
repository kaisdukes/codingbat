package codingbat.array3;

public class Fix45 {

    public static int[] fix45(final int[] nums) {
        var index5 = -1;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                var match = false;
                for (var j = index5 + 1; j < nums.length; j++) {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                        index5 = j;
                        match = true;
                        break;
                    }
                }
                if (match) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[index5];
                    nums[index5] = temp;
                }
            }
        }
        return nums;
    }
}