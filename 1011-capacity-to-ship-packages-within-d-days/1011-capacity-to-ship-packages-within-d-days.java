class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int ele:weights){
            max=Math.max(max,ele);
            sum+=ele;
        }
        int left=max;
        int right=sum;
        while(left<right){
            int mid=left+(right-left)/2;
            int day=1;
            int ans=0;
            for(int ele:weights){
                if(ans+ele>mid){
                    day++;
                    ans=ele;
                }else{
                    ans+=ele;
                }
            }
            if(day<=days){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}