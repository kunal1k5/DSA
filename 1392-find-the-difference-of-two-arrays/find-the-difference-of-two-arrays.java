class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
          List<Integer> b=new ArrayList<>();
          int[] num1 = Arrays.stream(nums1).distinct().toArray();
            int[] num2 = Arrays.stream(nums2).distinct().toArray();
        int f=0;
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                    f=1;
                    break;
                }
            }
            if(f!=1){
                a.add(num1[i]);
            
            }
                f=0;
        }
        ans.add(a);
       
        f=0;
        for(int i=0;i<num2.length;i++){
            for(int j=0;j<num1.length;j++){
                if(num1[j]==num2[i]){
                    f=1;
                    break;
                }
            }
            if(f!=1){
                b.add(num2[i]);
               
            }
             f=0;
        }
        ans.add(b);
        return ans;
    }
}