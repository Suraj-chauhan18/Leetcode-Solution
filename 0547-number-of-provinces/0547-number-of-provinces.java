class Solution {
    public int findCircleNum(int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<edges.length;i++){
            adj.add(new ArrayList<>());
        }
      for(int i=0;i<edges.length;i++){
        for(int j=0;j<edges.length;j++){
            if(edges[i][j]==1)
            adj.get(i).add(j);
        }
      }
        
        boolean[]visited=new boolean[edges.length];
        int count=0;
        for(int i=0;i<edges.length;i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                count++;
            }
        }
        
       return count; 
    }
    public void dfs(int n, ArrayList<ArrayList<Integer>> adj,boolean[]visited){
        
            visited[n]=true;
            for(int nbr:adj.get(n)){
                if(!visited[nbr]){
                    dfs(nbr,adj,visited);
                }
            }
    }
}