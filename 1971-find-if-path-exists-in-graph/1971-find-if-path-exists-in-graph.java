class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        boolean[] visit=new boolean[list.size()];
        return solve(list,visit,s,d);
    }
    public boolean solve(List<List<Integer>> list,boolean[] visit,int s,int d){
        visit[s]=true;
        if(s==d) return true;

        for(int nbr:list.get(s)){
            if(!visit[nbr]){
                visit[nbr]=true;
                if(solve(list,visit,nbr,d)){
                    return true;
                }
            }
        }
        return false;
    }
}