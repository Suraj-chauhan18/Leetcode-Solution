class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int count=0;
        String ans="";
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='1') count++;
           while(count>k){
            if(s.charAt(left)=='1') count--;
            left++;
           }
           if(count==k){
           while(left<=i && s.charAt(left)=='0'){
            left++;
           }
           
          String sb=s.substring(left,i+1);

         if(ans.equals("") || ans.length()>sb.length()||ans.length()==sb.length() && sb.compareTo(ans)<0 ){
            ans=sb;
         }
        }
        }
         return ans;
    }
}