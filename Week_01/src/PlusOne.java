/**
 * 66 加一
 * https://leetcode-cn.com/problems/plus-one/
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        int[] newDigits = new int[len + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}