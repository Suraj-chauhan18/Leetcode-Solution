class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][]dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0,text1,text2,dp);
    }
    int solve(int m,int n,String s1,String s2,int[][]dp){
        if(m==s1.length()|| n==s2.length()) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(s1.charAt(m)==s2.charAt(n)){
            return dp[m][n]=1+solve(m+1,n+1,s1,s2,dp);
        }
        int skip1=solve(m+1,n,s1,s2,dp);
        int skip2=solve(m,n+1,s1,s2,dp);
        return dp[m][n]=Math.max(skip1,skip2);
    }
}