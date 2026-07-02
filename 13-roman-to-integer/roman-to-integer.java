class Solution {
    public int romanToInt(String s) {

        int add = 0;

        for(int i=0; i<s.length(); i++){

            if(i + 1 < s.length() && s.substring(i,i+2).equals("IV")){
                add += 4;
                i++;
            }
           else if(i + 1 < s.length() && s.substring(i,i+2).equals("IX")){
                add += 9;
                i++;
            }
           else if(i + 1 < s.length() && s.substring(i,i+2).equals("XL")){
                add += 40;
                i++;
            }
           else if(i + 1 < s.length() && s.substring(i,i+2).equals("XC")){
                add += 90;
                i++;
            }
           else if(i + 1 < s.length() && s.substring(i,i+2).equals("CD")){
                add += 400;
                i++;
            }
           else if(i + 1 < s.length() && s.substring(i,i+2).equals("CM")){
                add += 900;
                i++;
            }
            else{
            char ch = s.charAt(i);
           
            if(ch == 'I') add += 1;
            if(ch == 'V') add += 5;
            if(ch == 'X') add += 10;
            if(ch == 'L') add += 50;
            if(ch == 'C') add += 100;
            if(ch == 'D') add += 500;
            if(ch == 'M') add += 1000;
            }
        }

        return add;
    }
}