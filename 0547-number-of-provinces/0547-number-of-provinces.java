class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean[] vis=new boolean[isConnected.length];
        
        for(int i=0;i<isConnected.length;i++){
          if(!vis[i]){
             count++;
             Queue<Integer> q=new ArrayDeque<>();
             q.offer(i);
             vis[i]=true;
             while(!q.isEmpty()){
                int node=q.poll();
                for(int j=0;j<isConnected.length;j++){
                    if(isConnected[node][j]==1 && !vis[j]){
                        vis[j]=true;
                        q.offer(j);
                    }
                }
             }
           
          }
        }
          return count;
        }
    }
   
