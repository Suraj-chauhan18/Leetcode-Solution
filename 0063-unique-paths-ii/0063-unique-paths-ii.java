class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m+1][n+1];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0,m,n,grid,dp);
    }
    int solve(int r,int c,int m,int n,int[][] grid,int[][]dp){
        if(r>m-1 || c>n-1) return 0;
        if(grid[r][c]==1) return 0;
        if(r==m-1 && c==n-1) return 1;
       
        if(dp[r][c]!=-1) return dp[r][c];
        
        int right=solve(r,c+1,m,n,grid,dp);
        int down=solve(r+1,c,m,n,grid,dp);
        return dp[r][c]=right+down;
    }
}