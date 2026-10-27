class Solution {
    public String[] createGrid(int m, int n) {
       char[][] ch=new char[m][n]; 
       for(char[] c:ch){
        Arrays.fill(c,'#');
       }
        solve(m,n,ch,0,0);
        String [] s=new String[m];
        int i=0;
        for(char[]ch1:ch){
            StringBuilder sb=new StringBuilder();
            sb.append(ch1);
            s[i++]=sb.toString();
        }
        return s;
    }
    public void solve(int m,int n,char[][]ch,int r,int c){
        if(r==m|| c==n) return;
         ch[r][c]='.';
        if(r==m-1 ){
        solve(m,n,ch,r,c+1);
         }
        else{
        solve(m,n,ch,r+1,c);
        }
    }
}