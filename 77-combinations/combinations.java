class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] board = new boolean[n];

        combination(board, k, 0,ll, ans,0);
        return ans;
    }
     public static void combination(boolean[] board, int tq,int qpsf, List<Integer> ll,List<List<Integer>> ans,int idx){

        if(tq == qpsf){
           // System.out.println(ans);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx; i<board.length; i++){
            if(board[i] == false){ // box khali hai
                board[i] = true;// queen baith gyi
                ll.add(i+1);
                combination(board, tq, qpsf+1,ll, ans,i + 1);
                ll.remove(ll.size()-1);
                board[i] = false;// queen nikal gyi
            }
        }
    }
    
}