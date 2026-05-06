class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] result = new char[n][m];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                result[r][c] = '.';
            }
        }

        for (int i = 0; i < m; i++) {
            int lowestEmptyRow = n - 1;

            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '#') {
                    result[lowestEmptyRow][m - i - 1] = '#';
                    lowestEmptyRow--;
                } else if (box[i][j] == '*') {
                    result[j][m - i - 1] = '*';
                    lowestEmptyRow = j - 1;
                }
            }
        }

        return result;
    }
}