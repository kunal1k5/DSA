class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
      

        combination(n, k, 1,ll, ans);
        return ans;
    }
     public static void combination(int n, int k,int idx, List<Integer> ll,List<List<Integer>> ans){

        if(ll.size() == k){
           // System.out.println(ans);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx; i<=n; i++){
                ll.add(i);
                combination(n, k, i+1,ll, ans);
                ll.remove(ll.size()-1);
        }
    }
    
}