package charString.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 *
 * @link {https://leetcode-cn.com/problems/permutations/}
 */
public class Permute {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        flashBack(nums, new LinkedList<>());
        return res;
    }

    void flashBack(int[] nums, LinkedList<Integer> list){

        if (nums.length == list.size()){
            res.add(new LinkedList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            flashBack(nums, list);
            list.removeLast();
        }

    }
}
