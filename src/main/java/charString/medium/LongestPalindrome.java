package charString.medium;

/**
 * 最长回文子串
 *
 * @link {https://leetcode-cn.com/problems/longest-palindromic-substring/}
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {

        int length = s.length();

        Boolean[][] dp = new Boolean[length][length];
        String res = "";
        int max = 0;
        for (int j = 0; j < length; j++) {
            for (int i = 0; i <= j; i++) {

                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = false;
                }

                if (dp[i][j]) {
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                        res = s.substring(i, j + 1);
                    }

                }

            }
        }
        return res;
    }
}
