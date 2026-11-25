class Solution {
    public int coinChange(int[] coins, int amount) {
     if(amount==0) return 0;
     int n=coins.length;
     int[][] dp=new int[n][amount+1];
     for(int[] row:dp){
        Arrays.fill(row,-1);
     }
     int ans=solve(0,coins,amount,dp);
     return ans==Integer.MAX_VALUE?-1:ans;
    }
    int solve(int idx,int[]coins,int amount,int[][]dp){
        if(idx==coins.length){
            if(amount==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[idx][amount]!=-1) return dp[idx][amount];
        int skip=solve(idx+1,coins,amount,dp);
        if(amount<coins[idx]) return dp[idx][amount]=skip;
        int pick=solve(idx,coins,amount-coins[idx],dp);
        int take=pick==Integer.MAX_VALUE?pick:pick+1;
        return dp[idx][amount]=Math.min(skip,take);
    }
}