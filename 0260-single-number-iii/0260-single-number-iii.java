class Solution {
    public int[] singleNumber(int[] nums) {
       int res=0;
       for(int i=0;i<nums.length;i++){
        res^=nums[i];
       } 
       int mask=res&(-res);
       int x=0;
       int y=0;
       for(int i=0;i<nums.length;i++){
        if((mask & nums[i])!=0){
            x^=nums[i];
        }else{
            y^=nums[i];
        }
       }
       return new int[]{x,y};
    }
}