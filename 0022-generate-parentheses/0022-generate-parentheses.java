class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        solve(n,0,0,"",list);
        return list;
    }
    public void solve(int n,int left, int right,String s,List<String> list){
      if(right==n){
        list.add(s);
        return;
      }
      if(left<n) solve(n,left+1,right,s+"(",list);
      if(right<left) solve(n,left,right+1,s+")",list);
    }
}