class Solution {
    public int removeElement(int[] nums, int val) {
       ArrayList<Integer> list=new ArrayList<>();
       for(int ele:nums){
        if(ele!=val){
            list.add(ele);
        }
       }
       int i=0;
       for(int ele:list){
        nums[i++]=ele;
       }
       return i;
    }
}