package dp;

/**
 * @link {https://leetcode.cn/problems/longest-increasing-subsequence/}
 */
public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        if (0 == length) {
            return 0;
        }

        int[] dp = new int[length];
        dp[0] = 1;
        int max = 1;

        for (int i = 1; i < length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
