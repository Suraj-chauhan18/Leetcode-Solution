class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int max=0;
      for(int ele:piles){
        max=Math.max(max,ele);
      }
      int left=1;
      int right=max;
      while(left<right){
         int mid=left+(right-left)/2;
         int hour=0;
         for(int ele:piles){
            hour+=(ele+(mid-1))/mid;
         }
         if(hour<=h) right=mid;
         else left=mid+1;
      }
      return left;
    }
}