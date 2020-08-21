package array;

/**
 * @author AoTxLand
 * @date 2020-08-21 10:50
 */
public class SearchMXNMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (j >= 0 && i < matrix.length) {
            if (matrix[i][j] == target) return true;
            if (target < matrix[i][j]) {
                j--;
            }
            else if (target > matrix[i][j]) {
                i++;
            }
        }
        return false;
    }
}
