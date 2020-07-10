package arrays;

/**
 * @author AoTxLand
 * @date 2020-07-10 15:53
 */
public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols - 1;
        while(row < rows && col > -1){
            if(matrix[row][col] == target){
                return true;
            }
            else{
                if(matrix[row][col] > target) {
                    col --;
                }
                else{
                    row ++;
                }
            }
        }
        return false;
    }
}
