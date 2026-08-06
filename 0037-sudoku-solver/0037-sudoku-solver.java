class Solution {
    public boolean isValid(char[][] arr, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == ch)
                return false;
            if (arr[row][i] == ch)
                return false;

        }
        int subI = (row / 3) * 3, subJ = (col / 3) * 3;
        for (int p = 0; p < 3; p++) {
            for (int q = 0; q < 3; q++) {
                if (arr[subI + p][subJ + q] == ch)
                    return false;
            }
        }
        return true;
    }

    public boolean solve(char[][] arr, int i, int j) {
        if (i == arr.length)
            return true;

        int ni = i;
        int nj = j + 1;

        if (nj == 9) {
            ni++;
            nj = 0;
        }
        if (arr[i][j] != '.') {
            if (solve(arr, ni, nj))
                return true;
        }else {
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isValid(arr, i, j, ch)) {
                    arr[i][j] = ch;
                    if(solve(arr, ni, nj)) return true;
                    arr[i][j] = '.';
                }
            }
        }
        return false;

    }

    public void solveSudoku(char[][] arr) {
        solve(arr, 0, 0);

    }
}