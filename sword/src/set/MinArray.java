package set;

/**
 * @author AoTxLand
 * @date 2020-07-10 17:43
 */
public class MinArray {
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j){
            int m = (i + j) / 2;
            if(numbers[m] > numbers[j]){
                i = m + 1;
            } else if(numbers[i] > numbers[m]){
                j = m;
            } else {
                j--;
            }
        }
        return numbers[i];
    }
}
