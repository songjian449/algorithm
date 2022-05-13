package charString.simple;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 两数之和
 *
 * @link {https://leetcode.cn/problems/two-sum/}
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hashMap.containsKey(target-nums[i])){
                return new int[]{i, hashMap.get(target-nums[i])};
            }

            hashMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
