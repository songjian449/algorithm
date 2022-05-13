package charString.medium;

/**
 * 每日温度
 *
 * @link {https://leetcode.cn/problems/daily-temperatures/}
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {

        int length = temperatures.length;
        int[] res = new int[length];

        for (int i = 0; i < length; i++) {
            int num = 0;
            for (int j = i; j < length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    num = j - i;
                    break;
                }
            }
            res[i] = num;
        }
        return res;
    }
}
