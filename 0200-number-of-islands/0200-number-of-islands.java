class Solution {
    public int numIslands(char[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        int count=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]=='1'){
       Queue<int[]> q=new ArrayDeque<>();
      
       q.offer(new int[]{i,j});
       grid[i][j]='0';
      
       while(!q.isEmpty()){
          int[]node=q.poll();
          int r=node[0];
          int c=node[1];
          for(int[] d:dir){
            int nr=r+d[0];
            int nc=c+d[1];
            if(nr>=0 &&  nr<n &&nc>=0 && nc<m && grid[nr][nc]=='1'){
                grid[nr][nc]='0';
                q.offer(new int[]{nr,nc});

            }
          }
          }
       count++;
        }
        }
       }
       
      return count;
     
    }
}