class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        solve(nums,0,list,ans);
        return list;
        
    }
    public void solve(int[] nums,int idx,List<List<Integer>> list,List<Integer> ans){
        if(idx==nums.length){
           
            for(int ele:nums){
                ans.add(ele);
            }
            list.add(new ArrayList<>(ans));
            ans.clear();
            return ;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            solve(nums,idx+1,list,ans);

            swap(nums,idx,i);
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}