package matrix;

/**
 * @author AoTxLand
 * @date 2020-07-18 10:50
 */
public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int[] out = new int[n * m];
        int sum = 0;
        int left = 0;
        int right = m - 1;
        int up = 0;
        int down = n - 1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = left; j <= right; j++) {
                out[sum] = matrix[up][j];
                sum++;
            }
            up++;
            if (sum > m * n - 1) {
                break;
            }
            for (int j = up; j <= down; j++) {
                out[sum] = matrix[j][right];
                sum++;
            }
            right--;
            if (sum > m * n - 1) {
                break;
            }
            for (int j = right; j >= left; j--) {
                out[sum] = matrix[down][j];
                sum++;
            }
            down--;
            if (sum > m * n - 1) {
                break;
            }
            for (int j = down; j >= up; j--) {
                out[sum] = matrix[j][left];
                sum++;
            }
            left++;
        }
        return out;
    }

    public static void main(String[] args) {
        SpiralOrder spiralOrder = new SpiralOrder();

    }
}
