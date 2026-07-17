class Solution {
    public int countSubstrings(String s) {
        return PrintSubString(s);
    }
    public static int PrintSubString(String str){
        int count =0;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<= str.length(); j++){
                
                String SubStr = str.substring(i,j);
                
                if(IsPalnidrome(SubStr)){
                    //System.out.println(SubStr);
                    count++;
                }
            }
            
        }
        return count;
    }
     public static boolean IsPalnidrome(String str){
        int i =0;
        int j= str.length()-1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
