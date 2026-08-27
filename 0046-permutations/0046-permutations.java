class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
       
        solve(nums,0,list);
        return list;
        
    }
    public void solve(int[] nums,int idx,List<List<Integer>> list){
        if(idx==nums.length){
            List<Integer> ans=new ArrayList<>();
            for(int ele:nums){
                ans.add(ele);
            }
            list.add(new ArrayList<>(ans));
            return ;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            solve(nums,idx+1,list);

            swap(nums,idx,i);
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}