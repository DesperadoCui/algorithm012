/**
 * 旋转数组
 * https://leetcode-cn.com/problems/rotate-array/
 */

public class Rotate {
    public static void main(String[] args) {
        int[] testArr = {1, 3, 2, 4, 1, 5};
        int len = testArr.length;
        //int k = 0;
        //int k = 18;
        int k = 23;

        /**
         * 1、k==0 或者 k % n == 0 直接返回原数组
         * 2、实际移动的位置是 k % n
         * 移动的位置相当于后边的元素跑到了前边，前边的元素跑到了后边
         * 先将整个数组反转，然后再将前k个元素反转，后length - k个元素反转
         */

        k %= len;
        if (k == 0) {
            System.out.println("不移动数组！");
            return;
        }

        new Rotate().reverseArr(testArr, 0, len - 1);
        new Rotate().reverseArr(testArr, 0, k - 1);
        new Rotate().reverseArr(testArr, k, len - 1);
        for (int m = 0; m < len; m++) {
            System.out.print(testArr[m] + ",");
        }
    }

    public void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
}
