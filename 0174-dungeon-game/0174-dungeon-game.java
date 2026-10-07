class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int n=dungeon.length;
        int m=dungeon[0].length;
        int[][] dp=new int[n][m];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(dungeon,0,0,n,m,dp);
        
    }
    public int solve(int[][]nums,int r,int c,int n,int m,int[][]dp){
        if(r>n-1 || c>m-1) return Integer.MAX_VALUE;
        if(dp[r][c]!=-1) return dp[r][c];
        if(r==n-1 && c==m-1){
            return dp[r][c]=Math.max(1,1-nums[r][c]);
        }
        int right=solve(nums,r,c+1,n,m,dp);
        int down=solve(nums,r+1,c,n,m,dp);
        int next=Math.min(right,down);
        return dp[r][c]=Math.max(1,next-nums[r][c]);
    }
}