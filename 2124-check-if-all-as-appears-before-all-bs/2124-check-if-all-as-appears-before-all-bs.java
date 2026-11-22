class Solution {
    public boolean checkString(String s) {
       int idxa=s.lastIndexOf('a');
       int idxb=s.indexOf('b');
       if(idxb==-1) return true;
       return idxa<idxb;
        
    }
}