package matrix;

/**
 * @author AoTxLand
 * @date 2020-07-11 9:36
 */
public class MatrixPath {
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++){
                if(dfs(board,chars,i,j,0)){
                    return true;
                }
            }
        return false;
    }

    public boolean dfs(char[][] board, char[] word, int i, int j, int k){
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k])
            return false;
        if(k == word.length - 1)
            return true;

        char t = board[i][j];
        board[i][j] = '/';
        boolean res = dfs(board, word, i + 1, j, k + 1)
                || dfs(board, word, i - 1, j, k + 1)
                || dfs(board, word, i, j + 1, k + 1)
                || dfs(board, word, i , j - 1, k + 1);
        board[i][j] = t;
        return res;

    }
}
