class Solution {
    public int coinChange(int[] coins, int amount) {
      if(amount==0) return 0;
      int n=coins.length;
      int[][]dp=new int[n][amount+1];
     
      int ans=solve(coins,0,amount,dp);
      return ans==Integer.MAX_VALUE?-1:ans;
    }
    int solve(int[] coins,int idx,int amount,int[][]dp){
        if(idx==coins.length){
            if(amount==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[idx][amount]!=0) return dp[idx][amount];
        int skip=solve(coins,idx+1,amount,dp);
        if(amount<coins[idx]) return dp[idx][amount]=skip;
        int take=solve(coins,idx,amount-coins[idx],dp);
        int pick=take==Integer.MAX_VALUE?  take:take+1;
        return dp[idx][amount]=Math.min(skip,pick);
    }
}