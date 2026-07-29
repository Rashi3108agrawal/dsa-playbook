class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];

        // Fill the board initially with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Track used columns and diagonals
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n];     // row - col + (n - 1)
        boolean[] diag2 = new boolean[2 * n];     // row + col

        backtrack(0, board, res, cols, diag1, diag2, n);
        return res;
    }

    private void backtrack(int row, char[][] board, List<List<String>> res,
                           boolean[] cols, boolean[] diag1, boolean[] diag2, int n) {
        if (row == n) {
            // Convert current board to list of strings
            List<String> solution = new ArrayList<>();
            for (char[] r : board) {
                solution.add(new String(r));
            }
            res.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;  // offset for diag1
            int d2 = row + col;

            if (cols[col] || diag1[d1] || diag2[d2]) continue;

            // Place queen
            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;

            // Recurse to next row
            backtrack(row + 1, board, res, cols, diag1, diag2, n);

            // Backtrack
            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }
}