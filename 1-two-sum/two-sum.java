class Solution {
    public int[] twoSum(int[] nums, int target) {
        return TwoSum(nums,target);
    }
     public static int[] TwoSum(int[] arr, int target){
     
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1;j<arr.length; j++){
                if(target - arr[j] == arr[i]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}