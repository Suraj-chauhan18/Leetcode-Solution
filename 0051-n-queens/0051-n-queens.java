class Solution {
    public List<List<String>> solveNQueens(int n) {
        char [][] board=new char[n][n];
        for(char [] row:board){
            Arrays.fill(row,'.');
        }
        List<List<String>> list=new ArrayList<>();
        solve(0,board,list);
        return list;
    }
    public static void solve(int r,char[][]board,List<List<String>>list){
        int n=board.length;
        if(r==n){
           
            List<String> ans=new ArrayList<>();
            for(char[]row:board){
                  ans.add(new String(row));
            }
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int c=0;c<n;c++) {
            if (possible(r,c,board)) {
                board[r][c] = 'Q';
                solve(r + 1, board, list);
                board[r][c] = '.';
            }
        }
    }
    public static boolean possible(int r,int c,char[][] board){
        int n=board.length;
        int m=board[0].length;
        for(int i=r;i>=0;i--){
            if(board[i][c]=='Q') return false;
        }
        for(int nr=r-1,nc=c-1; nr>=0 && nc>=0 ;nr--,nc--){
            if(board[nr][nc]=='Q') return false;
        }
       for(int nr=r-1,nc=c+1;nr>=0 && nc<n;nr--,nc++){
           if(board[nr][nc]=='Q') return false;
       }
       return true;
    }
}