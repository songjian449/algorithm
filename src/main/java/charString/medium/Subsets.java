package charString.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 子集
 *
 * @link {https://leetcode.cn/problems/subsets/}
 */
public class Subsets {

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0);
        return res;
    }

    public void backtrack(int[] nums, int target){
        res.add(new LinkedList<>(track));

        for (int i = target; i < nums.length; i++) {

            track.addLast(nums[i]);
            backtrack(nums, i + 1);
            track.removeLast();

        }
    }
}
