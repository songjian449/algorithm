package charString.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 电话号码的字母组合
 *
 * @link {https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/}
 */
public class LetterCombinations {

    String[] strs = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0){
            return res;
        }
        flashBack(digits, 0, new StringBuilder(), res);
        return res;
    }

    public void flashBack(String digits, int index, StringBuilder stringBuilder, List<String> res) {

        if (stringBuilder.length() == digits.length()) {
            res.add(stringBuilder.toString());
            return;
        }

        String str = strs[digits.charAt(index)-'0'];
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
            flashBack(digits, index + 1, stringBuilder, res);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
