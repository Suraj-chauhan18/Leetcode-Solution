class Solution {
    public int deleteAndEarn(int[] nums) {
    int n=nums.length;
    int max=0;
    for(int ele:nums){
        if(max<ele)  max=ele;
    } 
    int[] arr=new int[max+1];
    for(int ele:nums){
        arr[ele]+=ele;
    }
    int[]dp=new int[max+1];
    dp[0]=arr[0];
    dp[1]=Math.max(arr[0],arr[1]);
    for(int i=2;i<max+1;i++){
       dp[i]=Math.max(dp[i-1],arr[i]+dp[i-2]);
    }
     return dp[max];
    }
}