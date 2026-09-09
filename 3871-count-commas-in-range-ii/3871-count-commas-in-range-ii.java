class Solution {
    public long countCommas(long n) {
      long ans=0;
      long st=1000;
      long comma=1;
      while(st<=n){
        long end=Math.min(n,st*1000-1);
        ans+=(end-st+1)*comma;
        st*=1000;
        comma++;
      }
      return ans;
    }
}