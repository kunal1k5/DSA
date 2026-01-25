class Solution {
    public void rotate(int[] nums, int k) {
        Second(nums,k);
    }
    public static void Second(int[] arr,int k){
     
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        
    }

    public static void reverse(int[] arr,int i, int j){
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}