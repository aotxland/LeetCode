package baidu;

import java.util.*;
/**
 * @author AoTxLand
 * @date 2020-07-30 15:19
 */
public class ReadFile {

    public static void main(String[] args) {
        System.out.println(new ReadFile().testFinally());
        List<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n;i++){
            list.add(in.next());
        }
        int[][] nums = new int[list.size()][5];
        for (int i = 0; i < list.size(); i++) {
            String[] split = list.get(i).split("\\.");
            for (int i1 = 0; i1 < split.length; i1++) {
                nums[i][i1] = Integer.parseInt(split[i]);
            }
        }
        Arrays.sort(nums, (o1, o2) -> {
            if (o1[0] != o1[1]) return o1[0] - o1[1];
            else return o2[0] - o2[1];
        });
        for (int i = 0; i < nums[nums.length - 1].length - 1; i++) {
            System.out.print(nums[nums.length - 1][i] + ".");
        }
        System.out.println(nums[nums.length - 1][nums[nums.length - 1].length - 1]);
    }

    int testFinally(){
        try {
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return 0;
        }
    }
}
