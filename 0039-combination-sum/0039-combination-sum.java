class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        solve(candidates,0,list,res,target);
        return list;
    }
    public void solve(int[]nums,int idx,List<List<Integer>> list,List<Integer> res,int target){
        
           if(target==0){
            list.add(new ArrayList<>(res));
            return;
            }
        
          if(target<0 || idx==nums.length){
               return;
          }
           res.add(nums[idx]);
           solve(nums,idx,list,res,target-nums[idx]);
           res.remove(res.size()-1);
           solve(nums,idx+1,list,res,target);
        
    }
}