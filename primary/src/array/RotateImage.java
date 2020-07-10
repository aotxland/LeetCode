package array;

/**
 * @author AoTxLand
 * @date 2020-05-17 9:12
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
//        11->31 12->32 13->33
//        21->12 22->22 23->32
//        31->11 32->21 33->31
        for(int i = 0; i < matrix.length; i++)
            for(int j = i; j < matrix.length; j++){
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix.length / 2; j++){
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
    }
}
