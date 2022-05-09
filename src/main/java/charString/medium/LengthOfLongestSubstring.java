package charString.medium;

import java.util.HashMap;
import java.util.Objects;

/**
 * 无重复字符的最长子串
 *
 * @link {https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/}
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        if (null == s || 0 == s.length()){
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))){
                left = Math.max(map.get(right) + 1, left);
            }
            max = Math.max(max, right - left + 1);
            map.put(s.charAt(right), right);

        }
        return max;
    }
}
