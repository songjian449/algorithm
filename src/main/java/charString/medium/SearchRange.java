package charString.medium;

import java.util.Arrays;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 *
 * @link {https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/}
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int left = searchFirst(nums, target);
        int right = searchSecond(nums, target);
        return new int[]{left, right};

    }

    public int searchFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {

                if (0 == mid || target != nums[mid - 1]) {
                    return mid;
                } else {
                    right = mid - 1;
                }

            } else if (target >= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int searchSecond(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {

                if (nums.length - 1 == mid || target != nums[mid + 1]) {
                    return mid;
                } else {
                    left = mid + 1;
                }

            } else if (target >= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
