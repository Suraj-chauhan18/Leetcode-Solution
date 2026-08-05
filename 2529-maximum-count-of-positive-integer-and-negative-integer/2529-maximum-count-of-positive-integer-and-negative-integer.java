class Solution {
    public int maximumCount(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int ncount=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=0) right=mid-1;
            else left=mid+1;
        }
        ncount=left;
        left=0;
        right=nums.length-1;
        int pcount=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=0) left=mid+1;
            else right=mid-1;
        }
        pcount=nums.length-left;
        return Math.max(ncount,pcount);
    }
}