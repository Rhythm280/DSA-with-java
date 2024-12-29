package assignments.Arrays;

import java.util.Arrays;

public class getConcatenation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(concatenatArray(nums)));
    }

    public static int[] concatenatArray(int[] nums) {
        int[] ans = new int[2 * (nums.length)];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }
        return ans;
    }
}
