class Solution {
    public int numDistinct(String s, String t) {
        int [][] dp=new int[s.length()][t.length()];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0,s,t,dp);
    }
    public int solve(int i,int j,String s,String t,int[][]dp){
        if(j>=t.length()){
            return 1;
        }
        if(i>=s.length()){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        
        if(s.charAt(i)==t.charAt(j)){
        int skip=solve(i+1,j,s,t,dp);
        int take=solve(i+1,j+1,s,t,dp);
        return dp[i][j]= skip+take;
    }
       return solve(i+1,j,s,t,dp);
    }
}