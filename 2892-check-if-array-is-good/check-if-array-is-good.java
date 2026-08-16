class Solution {
    public boolean isGood(int[] nums) {
        return check_Good(nums);
    }
    public static boolean check_Good(int[] arr){
         Arrays.sort(arr);
        int n = arr.length;
        int max = arr[n-1];
        
        if(n != max + 1){
            return false;
        }

        for(int i =0; i < n - 2; i++){
            if(arr[i] != i+1){
                return false;
            }

        }

        if(max != arr[n-2]){
            return false;
        }

        return true;
    }

}