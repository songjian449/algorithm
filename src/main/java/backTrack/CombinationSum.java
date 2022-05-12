package backTrack;

import java.util.LinkedList;
import java.util.List;

/**
 * 组合总和
 *
 * @link {https://leetcode-cn.com/problems/combination-sum/}
 */
public class CombinationSum {
    int trackNum = 0;
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        if (candidates.length == 0){
            return res;
        }

        backTrack(candidates, 0, target);
        return res;
    }

    public void backTrack(int[] candidates, int start, int target) {
        if (target == trackNum) {
            res.add(new LinkedList<>(track));
            return;
        }
        if (trackNum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            trackNum = trackNum + candidates[i];
            track.addLast(candidates[i]);

            backTrack(candidates, i , target);

            trackNum = trackNum - candidates[i];
            track.removeLast();
        }
    }
}
