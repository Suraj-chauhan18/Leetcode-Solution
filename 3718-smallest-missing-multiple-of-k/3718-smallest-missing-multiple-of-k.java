class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] arr=new int[nums.length+1];
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
        set.add(ele);
        }
        int a=1;
        for(int i=0;i<nums.length+1;i++){
          arr[i]=a*k;
          a++;
         
        }
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                 ans=arr[i];
                break;
            }
        }
        return ans;
    }
}