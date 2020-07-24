package 刷题.leetcode.每日一题;

/** leetcode 999 **/

public class _326车的可用捕获量 {

    public int numRookCaptures(char[][] board) {

        int rook_x = 0;
        int rook_y = 0;
        int sum = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R'){
                    rook_x = j;
                    rook_y = i;
                }
            }
        }

        for (int i = rook_x; i < 8; i++) {
            if (board[rook_y][i] == 'p'){
                sum++;
                break;
            }
            if (board[rook_y][i] == 'B'){
                break;
            }
        }


        for (int i = rook_x; i > 0; i--) {
            if (board[rook_y][i] == 'p'){
                sum++;
                break;
            }
            if (board[rook_y][i] == 'B'){
                break;
            }
        }

        for (int i = rook_y; i < board.length; i++) {
            if (board[i][rook_x] == 'p'){
                sum++;
                break;
            }
            if (board[i][rook_x] == 'B'){
                break;
            }
        }

        for (int i = rook_y; i > 0; i--) {
            if (board[i][rook_x] == 'p'){
                sum++;
                break;
            }
            if (board[i][rook_x] == 'B'){
                break;
            }
        }
        return sum ;
    }

}
