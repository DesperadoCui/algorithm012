/**
 * 26 删除排序数组中重复的项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/submissions/
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        /**
         * 指定两个指针，一个指针i指向需要比较的数，另一个指针j去遍历后边的数组元素
         * 直到碰到不相同的，这时候将i+1设置为j指向的元素，顺便i后移一位选择新的比较元素
         */

        int[] testArr = {1, 1, 2, 3, 4, 5};
        int i = 0;
        for (int j = 1; j < testArr.length; j++) {
            if (testArr[i] != testArr[j]) {
                i++;
                testArr[i] = testArr[j];
            }
        }

        System.out.println("The new array's length is :" + (i + 1));
        for (int n = 0; n <= i; n++) {
            System.out.print(testArr[n] + ",");
        }
    }
}
