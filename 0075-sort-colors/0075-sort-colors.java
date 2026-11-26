class Solution {
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(right>=mid){
            if(nums[mid]==0){
                swap(nums,mid,left);
                left++;
                mid++;
            }
            else if(nums[mid]==1) mid++;
        
        else{
            swap(nums,mid,right);
            right--;
        }
    }
    }
}