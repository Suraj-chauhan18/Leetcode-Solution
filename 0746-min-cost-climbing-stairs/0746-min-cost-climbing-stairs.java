class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        solve(cost,0,n,dp);
        return Math.min(dp[0],dp[1]);
    }
    int solve(int[] cost,int idx,int n,int[]dp){
        if(idx>=n) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int one=solve(cost,idx+1,n,dp)+cost[idx];
        int two=solve(cost,idx+2,n,dp)+cost[idx];
        return dp[idx]=Math.min(one,two);
    }
}