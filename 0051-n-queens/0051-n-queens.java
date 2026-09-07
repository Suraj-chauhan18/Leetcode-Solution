class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list=new ArrayList<>();
        char[][] board=new char[n][n];
        for(char[]row:board){
            Arrays.fill(row,'.');
        }
        solve(0,list,board,n);
        return list;
    }
    public void solve(int row,List<List<String>> list,char[][]board,int n){
        if(row==n){
            List<String> ans=new ArrayList<>();
            for(char[] r:board){
                ans.add(new String(r));
            }
            list.add(ans);
            return;
        }
        for(int col=0;col<n;col++){
            if(possible(row,col,board,n)){
                board[row][col]='Q';
                solve(row+1,list,board,n);
                board[row][col]='.';
            }
        }
    }
    public boolean possible(int row,int col,char[][]board,int n){
        
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}