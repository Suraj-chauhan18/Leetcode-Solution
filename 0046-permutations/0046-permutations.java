class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
       boolean[] used=new boolean[nums.length]; 
       List<Integer> ans=new ArrayList<>();
       solve(nums,used,list,ans);
       return list;
    }
    public void solve(int[] nums,boolean[]used,List<List<Integer>>list,List<Integer> ans){
        if(ans.size()==nums.length){

            list.add(new ArrayList<>(ans));
            return;
        }
   for(int i=0;i<nums.length;i++){
    if(!used[i]){
        ans.add(nums[i]);
        used[i]=true;
        solve(nums,used,list,ans);
        ans.remove(ans.size()-1);
        used[i]=false;

    }
   }
    }
}