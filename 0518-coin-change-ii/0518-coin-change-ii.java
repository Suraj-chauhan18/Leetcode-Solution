class Solution {
    public int change(int amount, int[] coins) {
      int n=coins.length;
      int[][] dp=new int[n][amount+1];
      for(int[] row:dp){
        Arrays.fill(row,-1);
      }
      return solve(0,amount,coins,dp);
    }
    int solve(int idx ,int amount,int [] coins,int[][]dp){
        if(amount==0) return 1;
        if( amount<0 || idx==coins.length ) return 0;
        
        if(dp[idx][amount]!=-1) return dp[idx][amount];
        int take=solve(idx,amount-coins[idx],coins,dp);
        int nottake=solve(idx+1,amount,coins,dp);
        return dp[idx][amount]=take+nottake;
    }
}