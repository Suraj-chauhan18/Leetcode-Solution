class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int minremove=minremoval(s);
        solve(0,s,list,sb,0,minremove);
        return list;
    }
    public static void solve(int idx,String s,List<String> list,StringBuilder sb,int remove,int minremove){
        if(idx==s.length()) {
            if (remove==minremove && possible(sb.toString()) && !list.contains(sb.toString())) {
                list.add(sb.toString());
            }
            return;
        }
          if(s.charAt(idx)=='(' || s.charAt(idx)==')'){
           solve(idx+1,s,list,sb,remove+1,minremove);
          }
            solve(idx+1,s,list,sb.append(s.charAt(idx)),remove,minremove);
           sb.deleteCharAt(sb.length()-1);
}
    public static boolean possible(String sb){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<sb.length();i++){

            
            if(sb.charAt(i)=='(') st.push('(');

            else if(sb.charAt(i)==')'){
                if(st.isEmpty()) return false;
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
}
 public static int minremoval(String s){
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }else if(s.charAt(i)==')'){
                if(open==0){
                    close++;
                }else{
                    open--;
                }
            }
        }
        return open+close;
    }
}