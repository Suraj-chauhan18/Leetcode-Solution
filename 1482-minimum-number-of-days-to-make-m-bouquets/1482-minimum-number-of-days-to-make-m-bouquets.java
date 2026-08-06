class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int ele:bloomDay){
        min=Math.min(min,ele);
        max=Math.max(max,ele);
       } 
       int left=min;
       int right=max;
       int ans=-1;
       while(left<=right){
        int mid=left+(right-left)/2;
        int flowers=0;
        int bouquets=0;
        for(int ele:bloomDay){
            if(ele<=mid){
                flowers++;
                if(flowers==k){
                    bouquets++;
                    flowers=0;
                }
            }else{
                    flowers=0;
                }
            
        }
        if(bouquets>=m){
            ans=mid;
            right=mid-1;
        }else{
            left=mid+1;
        }
       }
       return ans;
    }
}