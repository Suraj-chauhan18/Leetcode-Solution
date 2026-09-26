class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            
            
               map.merge(ch,1,Integer::sum);
            
            while(map.get(ch)>1){
                 char c=s.charAt(left);
                 map.put(c,map.get(c)-1);
                 left++;
            }
            
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}