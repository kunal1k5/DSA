class Solution {
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }

        solve(m-1,n-1,dp);
        return dp[m-1][n-1];
    }

    public int solve(int row, int col,int[][] dp){
        
        if(row == 0 && col == 0){
    return dp[row][col] = 1;  // store result in dp
}

        if(row < 0 || col <0){
            return 0;
        }

        if(dp[row][col] != -1){
            return dp[row][col];
        }

        int up = 0;
        int left = 0;
        if(row > 0){
           up = solve(row-1, col,dp);
        }

        if(col > 0){
            left = solve(row,col-1,dp);
        }

        return dp[row][col] = up + left;
    }
}