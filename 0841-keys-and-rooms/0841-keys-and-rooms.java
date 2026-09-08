class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        dfs(0,rooms,visited);
        for(boolean x:visited){
            if(!x){
                return false;
            }
        }
        return true;
    }
    public void dfs(int room,List<List<Integer>> rooms,boolean[]visited){
        if(visited[room]){
            return;
        }
        visited[room]=true;
        for(int n:rooms.get(room)){

                dfs(n,rooms,visited);
            
        }
    }
}