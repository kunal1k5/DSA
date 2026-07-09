class Solution {
    public List<List<String>> partition(String s) {
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        Partitioning(s, ll, ans);
        return ans;
    }
     public static void Partitioning(String ques, List<String> ll, List<List<String>> ans){

        if(ques.length() == 0){
           // System.out.println(ll);
           ans.add(new ArrayList<>(ll));
            return;  // question ke length ke upper agar if lga ho to kabhi kabhi without return bhi chal jata
        }
        for(int i=1; i<=ques.length(); i++){
            String s = ques.substring(0,i);

            if(isPalindrome(s) == true){
                ll.add(s);
                Partitioning(ques.substring(i), ll, ans);

                ll.remove(ll.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s) {

        int i =0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}