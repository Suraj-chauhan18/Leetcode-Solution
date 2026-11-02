class Solution {
    public int maxProfit(int[] prices) {
      int buy=prices[0];
      int max=0;
      for(int sell:prices){
        max=Math.max(max,sell-buy);
        if(buy>sell) buy=sell;
      }
      return max;
    }
}