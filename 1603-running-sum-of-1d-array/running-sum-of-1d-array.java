class Solution {
    public int[] runningSum(int[] nums) {
         int n= nums.length;

        for(int i=1; i<n; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }
        return nums;

    }
}