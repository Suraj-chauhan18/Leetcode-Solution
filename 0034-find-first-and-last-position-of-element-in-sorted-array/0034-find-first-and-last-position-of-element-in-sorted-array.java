class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]arr=new int[2];
        int fidx=-1;
        int lidx=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid =left+(right-left)/2;
            if(nums[mid]==target){
                 fidx=mid;
                 right=mid-1;
            }else if(nums[mid]>target) right=mid-1;
            else{
              
                left=mid+1;
            }
        }
        arr[0]=fidx;
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                lidx=mid;
                left=mid+1;
                
            }
            else if(nums[mid]>target){
                right=mid-1;
                }else{
                left=mid+1;
            }
        }
            arr[1]=lidx;
            return arr;
    }
}