package charString.medium;

import java.util.Arrays;

/**
 * ...
 *
 * @link {}
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {

        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        dp[1] = coins[0] == 1 ? 1 : 0;

        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if (coin > i) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
