package charString.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 字母异位词分组
 *
 * @link {https://leetcode.cn/problems/group-anagrams/}
 */
public class GroupAnagrams {

    HashMap<String, List<String>> res = new HashMap<>();

    public List<List<String>> groupAnagrams(String[] strs) {

        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            List<String> orDefault = res.getOrDefault(s, new ArrayList<>());
            orDefault.add(str);
            res.put(s,orDefault);

        }
        return new ArrayList<List<String>>(res.values());
    }
}
