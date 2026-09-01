class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        boolean[] use=new boolean[nums.length];
        Arrays.sort(nums);
        solve(nums,0,list,ans,use);
        return list;
    }
    public void solve(int[] nums,int idx,List<List<Integer>> list,List<Integer> ans,boolean [] use){
        if(idx==nums.length){
            list.add(new ArrayList<>(ans));
            return ;
        }
        for(int i=0;i<nums.length;i++){
           if(use[i]) continue;
          if(i>0 && nums[i]==nums[i-1] && !use[i-1]){
            continue;
          }
          use[i]=true;
          ans.add(nums[i]);
          solve(nums,idx+1,list,ans,use);
          ans.remove(ans.size()-1);
          use[i]=false;
        }
    }
}