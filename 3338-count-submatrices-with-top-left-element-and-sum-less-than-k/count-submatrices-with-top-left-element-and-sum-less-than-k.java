class Solution {
    public int countSubmatrices(int[][] grid, int k) {
       int rows = grid.length;
        int cols = grid[0].length;
      
        int[][] prefixSum = new int[rows + 1][cols + 1];
      
        int count = 0;
      
        // Build prefix sum array and count valid submatrices
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                prefixSum[i][j] = prefixSum[i - 1][j]           // Sum from top
                                + prefixSum[i][j - 1]           // Sum from left
                                - prefixSum[i - 1][j - 1]       // Remove overlap
                                + grid[i - 1][j - 1];           // Add current 
                // increment the counter
                if (prefixSum[i][j] <= k) {
                    count++;
                }
            }
        }
      
        return count; 
    }
}