class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>nums.length/3){
                if(!list.contains(nums[i]))
                list.add(nums[i]);
            }
        }
        return list;
    }
}