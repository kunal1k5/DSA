class Solution {
    public int maxSubArray(int[] nums) {
         int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum = sum + nums[j];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}