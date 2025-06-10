class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.') continue; 
                int num = ch - '1'; 
                if (rows[r][num]) return false;
                rows[r][num] = true;                
                if (cols[c][num]) return false;
                cols[c][num] = true;
                int boxIndex = (r / 3) * 3 + (c / 3);
                if (boxes[boxIndex][num]) return false;
                boxes[boxIndex][num] = true;
            }
        }
        return true;
    }
}
