package charString.medium;

/**
 * 跳跃游戏
 *
 * @link {https://leetcode.cn/problems/jump-game/}
 */
public class CanJump {
    public boolean canJump(int[] nums) {

        if (nums.length == 0) {
            return true;
        }

        if (nums.length == 1 && nums[0] == 0) {
            return true;
        }

        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            max = Math.max(max, i + nums[i]);

            if (max == i) {
                return false;
            }

            if (max >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
