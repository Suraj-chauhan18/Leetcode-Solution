class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        int lessthantarget=0;
        int equaltotarget=0;
        for(int ele:nums){
            if(ele<target) lessthantarget++;
            if(ele==target) equaltotarget++;
        }
        for(int i=0;i<equaltotarget;i++){
                list.add(lessthantarget+i);
            }
        
        return list;
    }
}