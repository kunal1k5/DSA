class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ll = new ArrayList<>(); // 1d array list
        List<List<Integer>> ans = new ArrayList<>(); // 2d arraylist

        combination(candidates, target, ll,0,ans);
        return ans;
    }
     public static void combination(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
        if(amount == 0){
            //System.out.println(ll);
            ans.add(new ArrayList<>(ll)); // yaha pe new arraylist bana ke data daal rahe kyuki remove karne pe list se data remove ho jayega 
            return;
        }
        for(int i = idx; i< coin.length; i++){
            if(amount >= coin[i]){
                ll.add(coin[i]);
                combination(coin, amount-coin[i], ll, i,ans);
                ll.remove(ll.size() - 1); // pichhe ka data remove ho raha 
            }
        }
    }
}