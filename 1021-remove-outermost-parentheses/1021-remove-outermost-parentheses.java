class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        String str=solve(0,s,"",sb);
        return str;

    }
    public String solve(int idx,String s,String str,StringBuilder sb){
        if(idx==s.length()){
            if(sb.length()>0 && valid(sb.toString())){
                sb.deleteCharAt(0);
               sb.deleteCharAt(sb.length()-1);
               str=str+=sb;
               sb.setLength(0); 
            }
            return str;
        }
         if(sb.length() >0 && valid(sb.toString())){
                sb.deleteCharAt(0);
               sb.deleteCharAt(sb.length()-1);
               str=str+=sb;
               sb.setLength(0); 
            }
        return solve(idx+1,s,str,sb.append(s.charAt(idx)));
    }
    public static boolean valid(String s){
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') open++;
            else{
                if(open==0) close++;
                else open--;
            }
        }
        return open+close==0;
    }
}