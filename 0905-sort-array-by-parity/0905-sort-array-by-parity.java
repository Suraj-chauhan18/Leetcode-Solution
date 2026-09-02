class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left=0;
        int right=nums.length-1;
        if(nums.length==1) return nums;
        while(left<right){
            if(nums[left]%2==0) left++;
            if(nums[right]%2==1) right--;
            if(right>left && nums[left]%2==1 && nums[right]%2==0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        return nums;
    }
}