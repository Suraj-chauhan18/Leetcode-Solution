class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long[] arr=new long[n];
        int i=0;
        for(int ele:nums){
            arr[i++]=(long)ele*ele;
        }
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        long sum=0;
        while(left<right){
            sum-=arr[left];
            sum+=arr[right];
            left++;
            right--;
        }  
        if(left==right){
            sum+=arr[left];
        }
        return sum;  
    }
}