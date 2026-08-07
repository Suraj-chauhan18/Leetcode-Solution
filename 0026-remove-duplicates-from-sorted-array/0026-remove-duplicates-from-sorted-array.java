class Solution {
    public int removeDuplicates(int[] arr) {
        
        //if(arr.length==0) return 0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]!=arr[left]){
                left++;
                arr[left]=arr[right];
            }

        }
        return left+1;
    }
}