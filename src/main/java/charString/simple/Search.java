package charString.simple;

/**
 * 二分查找
 *
 * @link {https://leetcode-cn.com/problems/binary-search/}
 */
public class Search {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){

            int mid = (left + right) / 2;
            if (target == nums[mid]){
                return mid;
            }else if (target == nums[left]){
                return left;
            }else if (target == nums[right]){
                return right;
            }else if (target > nums[mid]){
                left = mid + 1;
            }else if (target < nums[mid]){
                right = mid - 1;
            }

        }
        return -1;
    }
}
