package charString.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 *
 * @link {https://leetcode-cn.com/problems/generate-parentheses/}
 */
public class GenerateParenthesis {
    List<String> res;

    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        backtrack(new StringBuilder(),n,n);
        return res;
    }

    private void backtrack(StringBuilder sb,int cntl,int cntr){
        if(cntr<cntl) return;
        if(cntl<0||cntr<0) return;

        if(cntl==0&&cntr==0){
            res.add(sb.toString());
            return;
        }

        sb.append('(');
        backtrack(sb,cntl-1,cntr);
        sb.deleteCharAt(sb.length()-1);

        sb.append(')');
        backtrack(sb,cntl,cntr-1);
        sb.deleteCharAt(sb.length()-1);
    }
}
