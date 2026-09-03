class Solution {
    public int[] transformArray(int[] nums) {
        int[] arr=new int[nums.length];
        int i=0;
        for(int ele:nums){
            if(ele%2==0){
                arr[i++]=0;
            }
        }
        for(int ele:nums){
            if(ele%2==1){
                arr[i++]=1;
            }
        }
        return arr;
    }
}