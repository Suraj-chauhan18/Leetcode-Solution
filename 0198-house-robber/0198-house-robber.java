class Solution {
    public int rob(int[] nums) {
    
     int n=nums.length;
     int[] dp=new int[n+1];
     Arrays.fill(dp,-1);
     return solve(nums,0,n,dp);
    }
    public int solve(int[] nums,int idx,int n,int[]dp){
        if(idx>=n) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int take=nums[idx]+solve(nums,idx+2,n,dp);
        int skip=solve(nums,idx+1,n,dp);
        return dp[idx]=Math.max(take,skip);
    }
}