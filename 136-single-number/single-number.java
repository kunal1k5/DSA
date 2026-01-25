class Solution {
    public int singleNumber(int[] nums) {
        return single(nums);
    }
    public static int single(int[] arr){
     
        int XOR = 0;
        for(int i=0; i<arr.length; i++){
            XOR = XOR ^ arr[i];
        }
        return XOR;

    }
}