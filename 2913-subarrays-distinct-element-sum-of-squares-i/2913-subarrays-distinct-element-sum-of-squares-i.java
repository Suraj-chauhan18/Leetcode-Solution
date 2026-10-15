class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        int n=nums.size();
        List<List<Integer>> list1=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
            List<Integer> list=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    if(!list.contains(nums.get(k)))
               list.add(nums.get(k));
               
            }

            int a=list.size();
            sum+=a*a;
            list1.add(list);
            }
            
        }
        //list.add
        System.out.println(list1);
        return sum;
    }
}