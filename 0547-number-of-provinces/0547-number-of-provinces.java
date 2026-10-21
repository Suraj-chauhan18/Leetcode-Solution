class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean[] vis=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
          if(!vis[i]){
             count++;
            dfs(isConnected,i,vis);
           
          }
        }
          return count;
        }
    
        public void dfs(int[][] edge,int src,boolean[] vis){
            vis[src]=true;
            for(int ele=0;ele<edge.length;ele++){
                 if(edge[src][ele]==1&& !vis[ele])
                  dfs(edge,ele,vis);
                }
            }
        }
   
