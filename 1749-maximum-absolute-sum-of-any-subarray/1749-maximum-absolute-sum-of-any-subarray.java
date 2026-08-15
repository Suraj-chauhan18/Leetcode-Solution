class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0;
        int max=0;
        int min=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max) max=sum;
            else if(sum<0) sum=0;
        }
        sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(min>sum){
                min=sum;
            }
            else if(sum>0) sum=0;
        }
        return Math.max(max,Math.abs(min));
    }
}