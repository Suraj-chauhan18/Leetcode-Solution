class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                left=i+1;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}