class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]arr=new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++){
            arr[j]=nums[i];
            j=j+2;
        }
        int k=1;
        for(int i=n;i<nums.length;i++){
            arr[k]=nums[i];
            k=k+2;
        }
        return arr;
    }
}