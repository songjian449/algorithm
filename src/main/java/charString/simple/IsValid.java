package charString.simple;

import java.util.HashMap;
import java.util.Stack;

/**
 * 有效的括号
 *
 * @link {https://leetcode-cn.com/problems/valid-parentheses/}
 */
public class IsValid {
    public boolean isValid(String s) {

        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (hashMap.containsKey(s.charAt(i))) {
                if (stack.isEmpty() || hashMap.get(s.charAt(i)) != stack.peek()) {
                    return false;
                }
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
