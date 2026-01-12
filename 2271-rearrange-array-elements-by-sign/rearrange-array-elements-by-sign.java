class Solution {
    public int[] rearrangeArray(int[] nums) {
        return Rearrange(nums);
    }

    public static int[] Rearrange(int arr[]){

        int n = arr.length;
        int ans[] = new int[n];
        int posIndex = 0;
        int negIndex = 1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                ans[negIndex] = arr[i];
                negIndex += 2;
            }
            else{
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return ans;
    }
}