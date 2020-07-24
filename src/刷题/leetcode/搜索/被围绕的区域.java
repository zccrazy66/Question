package 刷题.leetcode.搜索;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-07 15:53
 **/
public class 被围绕的区域 {
    public void solve(char[][] board) {
        if (board == null || board.length == 0){return;}
        int row = board.length;
        int col = board[0].length;


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                boolean isedge = i == 0 || i == row || j == 0 || j == col;
                if (board[i][j] == 'O' && isedge){
                    dfs(board,i,j);
                }
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '#'){
                    board[i][j] = 'O';
                }
                board[i][j] = 'X';
            }
        }

    }
    private void  dfs(char[][] board,int x, int y){

        if (x <= 0 || x == board.length || y <= 0 || y == board[0].length || board[x][y] == 'X' || board[x][y] == '#'){
            return;
        }
        board[x][y] = '#';
        dfs(board, x-1,y);
        dfs(board, x,y-1);
        dfs(board, x+1,y);
        dfs(board, x,y+1);

    }


}
