class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.sort(coins);
        int n = coins.length;
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] =0;
        for(int amt =1;amt<= amount;amt++){
            for(int i=0;i<n;i++){
                int coin = coins[i];
                int pick = Integer.MAX_VALUE;
                if(amt>=coin && dp[amt - coin] != Integer.MAX_VALUE) pick = 1+ dp[amt-coin];
                int notpick = dp[amt];
                dp[amt] = Math.min(pick, notpick);
            }
        }
        return dp[amount]== Integer.MAX_VALUE? -1: dp[amount];
    }
}