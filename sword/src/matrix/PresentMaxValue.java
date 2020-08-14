package matrix;

/**
 * @author AoTxLand
 * @date 2020-08-14 20:08
 */
public class PresentMaxValue {
    public int maxValue(int[][] grid) {
        int[][] pres = new int[grid.length][grid[0].length];
        pres[0][0] = grid[0][0];
        for (int i = 1; i < grid[0].length; i++) {
            pres[0][i] = grid[0][i] + pres[0][i - 1];
        }
        for (int i = 1; i < grid.length; i++) {
            pres[i][0] = grid[i][0] + pres[i - 1][0];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                pres[i][j] = Math.max(pres[i - 1][j], pres[i][j - 1]) + grid[i][j];
            }
        }
        return pres[grid.length - 1][grid[0].length - 1];
    }
}
