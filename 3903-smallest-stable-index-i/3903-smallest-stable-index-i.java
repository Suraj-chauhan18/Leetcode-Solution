class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
            max=Math.max(nums[j],max);
            }
            for(int j=i;j<n;j++){
            min=Math.min(nums[j],min);
            }
            arr[i]=max-min;
            
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                res=Math.min(res,i);
            }
        }
        if(res!=Integer.MAX_VALUE){
            return res;
        }else{
            return -1;
        }
    }
}