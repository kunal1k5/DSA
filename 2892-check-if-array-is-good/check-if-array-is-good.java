class Solution {
    public boolean isGood(int[] nums) {
        return check_Good(nums);
    }
    public static boolean check_Good(int[] arr){
         int n = arr.length;
        int max = n-1;

        int[] freq = new int[n];

        for(int num : arr){
            if(num > max || num < 1){
                return false;
            }
            freq[num]++;

            // freq[num]++ iska matalab
            // num = 3 → freq[3]++ → 3 ki count = 1
            // num = 4 → freq[4]++ → 4 ki count = 1
            // num = 4 → freq[4]++ → 4 ki count = 2
            // num = 1 → freq[1]++ → 1 ki count = 1
            // num = 2 → freq[2]++ → 2 ki count = 1
        }

        for(int i=1; i<max; i++){
            if(freq[i] != 1){
                return false;
            }
        }

        return freq[max] == 2;
    }

}