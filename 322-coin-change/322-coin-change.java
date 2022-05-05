class Solution {
    static int MAX = 10001;//Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i=1;i<dp.length;i++) dp[i] = MAX;
        
        for(int i=coins.length-1;i>=0;i--){
            for(int m = coins[i];m<=amount;m++){
                dp[m] = Math.min(dp[m],dp[m-coins[i]]+1);
            }
        }
        return dp[amount]==MAX?-1:dp[amount];
    }
}