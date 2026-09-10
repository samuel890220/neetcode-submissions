class Solution {
    //1.
    // public boolean isValidSudoku(char[][] board) {
    //     boolean[][] row = new boolean[9][9];
    //     boolean[][] col = new boolean[9][9];
    //     boolean[][] box = new boolean[9][9];

    //     for (int i = 0; i < 9; i++) {
    //         for (int j = 0; j < 9; j++) {
    //             char c = board[i][j];

    //             if (c == '.') continue;
                
    //             int num = c - '1'; // 轉成 0~8
    //             int boxIndex = (i / 3) * 3 + (j / 3);

    //             if (row[i][num] || col[j][num] || box[boxIndex][num]) {
    //                 return false;
    //             }

    //             row[i][num] = true;
    //             col[j][num] = true;
    //             box[boxIndex][num] = true;
    //         }
    //     }
    //     return true;
    // }

    //2.
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] box = new int[9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char value = board[r][c];
                if (value == '.') continue;
                int num = value - '1';
                if ((rows[r] & (1 << num)) > 0 || (cols[c] & (1 << num)) > 0
                || (box[(r / 3) * 3 + (c / 3)] & (1 << num)) > 0) {
                    return false;
                }
                

                rows[r] |= (1 << num);
                cols[c] |= (1 << num);
                box[(r / 3) * 3 + (c / 3)] |= (1 << num);

            }
        }

    return true;

    }


}

