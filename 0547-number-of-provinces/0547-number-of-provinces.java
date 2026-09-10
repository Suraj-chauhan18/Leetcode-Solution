class Solution {
    public int findCircleNum(int[][] edges) {
       boolean[]visited=new boolean[edges.length];
        int count=0;
        for(int i=0;i<edges.length;i++){
            if(!visited[i]){
                dfs(i,edges,visited);
                count++;
            }
        }
        
       return count; 
    }
    public void dfs(int n, int[][] edges,boolean[]visited){
        
            visited[n]=true;
            for(int nbr=0;nbr<edges.length;nbr++){
                if( edges[n][nbr]==1 && !visited[nbr]){
                    dfs(nbr,edges,visited);
                }
            }
    }
}