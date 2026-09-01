class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,0,list,ans ,target);
        return list;
    }
    public void solve(int[] nums,int idx,List<List<Integer>> list,List<Integer> ans,int target){
        if(target==0){
            list.add(new ArrayList<>(ans));
            return;
        }
       for(int i=idx;i<nums.length;i++){
        if(i>idx && nums[i]==nums[i-1]){
            continue;
        }
        if(nums[i]>target){
            continue;
        }
        ans.add(nums[i]);
        solve(nums,i+1,list,ans,target-nums[i]);
        ans.remove(ans.size()-1);
       }   
    }
}