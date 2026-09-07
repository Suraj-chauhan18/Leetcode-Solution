class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list=new ArrayList<>();
        char [][] board=new char[n][n];
        for(char [] row : board){
            Arrays.fill(row,'.');
        }
        solve(0,list,n,board);
        return list;
    }
    public void solve(int r,List<List<String>> list,int n,char[][]board){
        if(r==n){
            List<String> ans=new ArrayList<>();
             for(char[]ch:board){
                ans.add(new String(ch));
             }
             list.add(ans);
             return;
        }
        for(int c=0;c<n;c++){
           if(possible(r,c,n,board)){
            board[r][c]='Q';
            solve(r+1,list,n,board);
            board[r][c]='.';
           } 
        }
    }
    public boolean possible(int r,int c,int n,char[][]board){
        for(int i=r;i>=0;i--){
            if(board[i][c]=='Q'){
                return false;
            }
        }
        for(int i=r-1,j=c-1 ; i>=0 && j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=r-1,j=c+1; i>=0 && j<n; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}