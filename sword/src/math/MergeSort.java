package math;

/**
 * @author AoTxLand
 * @date 2020-08-17 20:02
 */
public class MergeSort {
    public void merge(int[] arr, int[] res, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) >> 1;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merge(arr, res, start1, end1);
        merge(arr, res, start2, end2);
        int i = start;
        while (start1 <= end1 && start2 <= end2) {
            res[i++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }
        while (start1 <= end1) {
            res[i++] = arr[start1++];
        }
        while (start2 <= end2) {
            res[i++] = arr[start2++];
        }
        if (end + 1 - start >= 0) System.arraycopy(res, start, arr, start, end + 1 - start);
    }
    public int reversePairs(int[] arr, int[] res, int start, int end) {
        if (start >= end) return 0;
        int mid = (start + end) >> 1;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        int count = 0;
        count += reversePairs(arr, res, start1, end1);
        count += reversePairs(arr, res, start2, end2);
        int i = start;
        while (start1 <= end1 && start2 <= end2) {
            count += arr[start1] < arr[start2] ? start2 - mid -1 : 0;
            res[i++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }
        while (start1 <= end1) {
            count += start2 - mid -1;
            res[i++] = arr[start1++];
        }
        while (start2 <= end2) {
            res[i++] = arr[start2++];
        }
        if (end + 1 - start >= 0) System.arraycopy(res, start, arr, start, end + 1 - start);
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4,6};
        int[] res = new int[arr.length];
        MergeSort mergeSort = new MergeSort();
        mergeSort.merge(arr,res,0, res.length - 1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
