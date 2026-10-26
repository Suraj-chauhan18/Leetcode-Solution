class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       int n=triangle.size();
       int[][] dp=new int[n][n];
       for(int [] row:dp){
        Arrays.fill(row,Integer.MAX_VALUE);
       }
       return solve(triangle,0,0,n,dp);
       
    }
    public int solve(List<List<Integer>> triangle,int i,int j,int n,int[][]dp){
         if(i==n-1) return triangle.get(i).get(j);
         if(i>=n ) return 0;
         if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
         int down=triangle.get(i).get(j)+solve(triangle,i+1,j,n,dp);
         int dia=triangle.get(i).get(j)+solve(triangle,i+1,j+1,n,dp);
         return dp[i][j]= Math.min(down,dia);
    }
}