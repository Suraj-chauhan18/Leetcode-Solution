class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        solve(nums,0,list,ans);
        return list;
    }
    public void solve(int[]nums,int idx,List<List<Integer>> list,List<Integer> ans){
        if(idx==nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[idx]);
        solve(nums,idx+1,list,ans);
        ans.remove(ans.size()-1);
        solve(nums,idx+1,list,ans);
    }
}