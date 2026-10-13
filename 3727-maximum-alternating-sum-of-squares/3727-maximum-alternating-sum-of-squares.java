class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int i=0;
        for(int ele:nums){
            arr[i++]=Math.abs(ele);
        }
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        long sum=0;
        while(left<right){
            sum-=arr[left]*arr[left];
            sum+=arr[right]*arr[right];
            left++;
            right--;
        }  
        if(left==right){
            sum+=arr[left]*arr[left];
        }
        return sum;  
    }
}