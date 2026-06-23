class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        
        
        for(int[] i: accounts){
            int sum = 0;
            for(int j : i){
                System.out.print(j + " ");
                sum += j;
            }
            ans = Math.max(sum,ans);
        }
         return ans;
    }
}