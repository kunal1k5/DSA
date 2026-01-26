class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return Subarray_Product_Less_Than_K(nums,k);
    }
     public static int Subarray_Product_Less_Than_K(int[] arr,int k){

        int si =0; // starting point
        int ei =0; // ending point
        int p = 1; // product
        int ans =0;
        while(ei < arr.length){

            // Growing -------------
            p *= arr[ei];

            // shrinking --------

            while(p >= k && si <= ei){
            
                p /= arr[si];
                si++;
                
            }

            // Answer calculate-------

            ans += (ei-si+1);
            ei++;
        }
        return ans;
    }

}