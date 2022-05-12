package backTrack;

import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 *
 * @link {https://leetcode.cn/problems/permutations/}
 */
public class Permute {

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {

        backTrack(nums);
        return res;

    }

    public void backTrack(int[] nums){

        if (track.size() == nums.length){
            res.add(new LinkedList<>(track));
        }

        for (int i = 0; i < nums.length; i++) {

            if (track.contains(nums[i])){
                continue;
            }
            track.addLast(nums[i]);
            backTrack(nums);
            track.removeLast();

        }

    }
}
