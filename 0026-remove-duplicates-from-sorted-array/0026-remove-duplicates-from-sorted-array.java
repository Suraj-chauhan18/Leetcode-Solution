class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int[] arr=new int[set.size()];
        int i=0;
        for(int ele:set){
            nums[i]=ele;
            i++;
        }
        return i;
    }
}