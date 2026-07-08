class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        combination(k, n, ll, ans, 1);
        return ans;
    }
   public static void combination(int k, int n, List<Integer> ll, List<List<Integer>> ans, int idx){

        if(k == ll.size() && n == 0){
           // System.out.println(ans);
           ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=idx; i<=9; i++){
            if(n >= i){
                ll.add(i);
                combination(k, n-i , ll, ans, i+1);
                ll.remove(ll.size()-1);
            }
        }

    }
}