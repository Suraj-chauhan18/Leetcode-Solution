class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
      if(n==1) return nums[0];
      int[]dp=new int[n+1];
      int[]dp1=new int[n+1];
      Arrays.fill(dp,-1);
      Arrays.fill(dp1,-1);
      int a=solve(nums,0,dp,n-2);
      int b=solve(nums,1,dp1,n-1);
      return Math.max(a,b);
    }
    public int solve(int[]nums,int idx,int[]dp,int n){
        if(idx>n) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int take=nums[idx]+solve(nums,idx+2,dp,n);
        int skip=solve(nums,idx+1,dp,n);
        return dp[idx]=Math.max(take,skip);
    }
}