/**
 * 52. N皇后II
 */
public class NQueens {
    public static void main(String[] args) {

    }

    public int backtrack(int row, int hills, int next_row, int dales, int count, int n) {
        int columns = (1 << n) - 1;

        if (row == n)   // 如果已经放置了 n 个皇后
            count++;  // 累加可行解
        else {
            int free_columns = columns & ~(hills | next_row | dales);

            // 找到可以放置下一个皇后的列
            while (free_columns != 0) {
                int curr_column = - free_columns & free_columns;
                free_columns ^= curr_column;

                count = backtrack(row + 1,
                        (hills | curr_column) << 1,
                        next_row | curr_column,
                        (dales | curr_column) >> 1,
                        count, n);
            }
        }

        return count;
    }

    public int totalNQueens(int n) {
        return backtrack(0, 0, 0, 0, 0, n);
    }
}