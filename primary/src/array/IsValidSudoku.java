package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AoTxLand
 * @date 2020-05-16 21:58
 */
public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Character,Boolean> rows;
        Map<Character,Boolean> columns;
        HashMap<Character,Boolean> [] boxes = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            boxes[i] = new HashMap<>();
        }

        for(int i = 0; i < 9; i++){
            rows = new HashMap<>();
            columns = new HashMap<>();

            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.') {
                    if(rows.containsKey(board[i][j]))
                        return false;
                    if(columns.containsKey(board[i][j]))
                        return false;
                    rows.put(board[i][j], true);
                    columns.put(board[j][i], true);
                    int box_index = (i / 3 ) * 3 + j / 3;
                    boxes[box_index].put(board[i][j],true);
                    if (boxes[box_index].get(board[i][j]) )
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
