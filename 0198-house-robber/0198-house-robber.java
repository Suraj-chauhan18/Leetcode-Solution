class Solution {
    public int rob(int[] nums) {
    int n=nums.length;
    int prev1=0;
    int prev=0;
    for(int i=0;i<n;i++){
        int curr=Math.max(prev,prev1+nums[i]);
        prev1=prev;
        prev=curr;
    }
    return prev;
    }
}