class Solution {
    public int trap(int[] height) {
        return TrapWater(height);
    }
    public static int TrapWater(int[] arr) {

        int sum = 0;
        int n = arr.length;
        int[] l = new int[n];

        l[0] = arr[0];
        for(int i=1; i<n; i++){
            l[i] = Math.max(l[i-1],arr[i]);
        }

        int[] r = new int[n];
        r[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            r[i] = Math.max(r[i+1],arr[i]);
        }

        for(int i=0; i<n; i++){
            sum += Math.min(l[i],r[i]) - arr[i];
        }
        return sum;
    }
}