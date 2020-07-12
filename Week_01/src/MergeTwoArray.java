/**
 * 88 合并两个有序数组
 * https://leetcode-cn.com/problems/merge-sorted-array/
 */
package leetcode;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 4, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 9};
        int len1 = 8;
        int len2 = 3;

        int p1 = len1 - 1;
        int p2 = len2 - 1;
        int p = len1 + len2 - 1;
        while ((p1 >= 0) && (p2 >= 0)) {
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
        }

        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
