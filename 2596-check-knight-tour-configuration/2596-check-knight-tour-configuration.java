class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]!=0){
            return false;
        }
        return solve(0,0,1,grid,n);
    }
    public boolean solve(int r,int c,int num,int[][]grid,int n){
        if(num==n*n){
            return true;
        }
        int[][] moves={{-2,-1},{-2,1},{-1,-2},{1,-2},{2,-1},{2,1},{-1,2},{1,2}};

        for(int[] move:moves){
            int newr=r+move[0];
            int newc=c+move[1];

            if(newr>=0 && newr<n && newc>=0 && newc<n && grid[newr][newc]==num){
                if(solve(newr,newc,num+1,grid,n)){
                return true;
                }
            }
        }
        return false;
    }
    
}