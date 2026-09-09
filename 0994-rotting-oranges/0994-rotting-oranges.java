class Solution {
    public int orangesRotting(int[][] grid) {
      int n=grid.length;
      int m=grid[0].length;
      Queue<int[]> q=new ArrayDeque<>();
      int fresh=0;
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==2){
                q.offer(new int[]{i,j});
            }if(grid[i][j]==1){
                fresh++;
            }
        }
      } 
      int min=0;
      int[][]dir={{-1,0},{0,-1},{0,1},{1,0}};
      while(!q.isEmpty() && fresh>0){
        int size=q.size();
        for(int i=1;i<=size;i++){
             int[]curr=q.poll();
             int r=curr[0];
             int c=curr[1];
             for(int[] d:dir){
                int nr=r+d[0];
                int nc=c+d[1];
              if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 ){
                grid[nr][nc]=2;
                fresh--;
                q.offer(new int[]{nr,nc});
              }
            }
        }
        min++;
      } 
       return fresh > 0 ? -1 : min;
    }
}