class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost,0,dp),solve(cost,1,dp));
        
    }
    public int solve(int[] nums,int idx,int[] dp){
        int n=nums.length;
        if(idx>=n){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        int a=solve(nums,idx+1,dp)+nums[idx];
        int b=solve(nums,idx+2,dp)+nums[idx];
        return dp[idx]=Math.min(a,b);
    }
}