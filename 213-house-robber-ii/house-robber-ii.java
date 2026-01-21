class Solution {
    public int rob(int[] nums) {
        return robb(nums);
    }

    public int robb(int[] houses){
        int n = houses.length;
        if(n == 1) return houses[0];

        int[] houses1 = new int[n-1];
        for(int i=0; i<n-1; i++){
            houses1[i] = houses[i];
        }
        int[] dp1 = new int [n-1];
        Arrays.fill(dp1, -1);

        int[] houses2 = new int[n-1];
        for(int i=1; i<n; i++){
            houses2[i-1] = houses[i];
        }
        int[] dp2 = new int[n-1];
        Arrays.fill(dp2, -1);

        return Math.max(
            startRob(houses1, houses1.length-1, dp1),
            startRob(houses2, houses2.length-1, dp2)
        );
    }
    public int startRob(int[] nums,int idx,int[] dp){
        if(idx < 0) return 0;
        if(idx==0) return nums[0];

        if(dp[idx] != -1) return dp[idx];

        int pick = nums[idx] + startRob(nums, idx-2, dp);
        int notPick = startRob(nums,idx-1,dp);
        return dp[idx] = Math.max(pick,notPick);
    }
}