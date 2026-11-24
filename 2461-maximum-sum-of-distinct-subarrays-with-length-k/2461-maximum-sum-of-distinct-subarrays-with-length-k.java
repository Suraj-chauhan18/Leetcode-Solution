class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        long max=0;
        long sum=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(i-left+1>k){
                int removed=nums[left];
                sum-=removed;
                map.put(removed,map.get(removed)-1);
                if(map.get(removed)==0){
                    map.remove(removed);
                }
                left++;
            }
            if(i-left+1==k && map.size()==k){
                max=Math.max(max,sum);
            }
           
        }
        return max;
    }
}