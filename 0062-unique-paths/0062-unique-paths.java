class Solution {
    
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0,m,n,dp);
         
    }
    public int solve(int r,int c,int m,int n,int[][]dp){
        if(r==m-1 && c==n-1) return 1;
        if(r>m-1 || c>n-1) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
            int right=solve(r+1,c,m,n,dp);
            int down=solve(r,c+1,m,n,dp);
            dp[r][c]=right+down;
            return dp[r][c];
        

    }
}