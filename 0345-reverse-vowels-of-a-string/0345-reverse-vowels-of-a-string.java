class Solution {
    public String reverseVowels(String s) {
      String str="aeiouAEIOU";
      int left=0;
      int right=s.length()-1;
      char[]ch=s.toCharArray();
      while(left<right){
        while(left<right && str.indexOf(ch[left])==-1){
            left++;
        }
        while(left<right && str.indexOf(ch[right])==-1){
            right--;
        }
        char temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        left++;
        right--;
      }
      return new String(ch);
    }
}