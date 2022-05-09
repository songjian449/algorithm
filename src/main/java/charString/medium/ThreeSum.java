package charString.medium;

import java.util.*;

/**
 * 三数之和
 *
 * @link {https://leetcode-cn.com/problems/3sum/}
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);

        for (int left = 0; left < nums.length; left++) {
            int medium = left + 1;
            int right = nums.length - 1;
            while (medium < right) {
                if (nums[left] + nums[medium] + nums[right] == 0) {
                    res.add(Arrays.asList(nums[left], nums[medium], nums[right]));
                    medium++;
                    right--;
                } else if (nums[left] + nums[medium] + nums[right] > 0) {
                    right--;
                } else {
                    medium++;
                }
            }
        }
        List<List<Integer>> resArr = new ArrayList<>();
        resArr.addAll(res);
        return resArr;
    }
}
