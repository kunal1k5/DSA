class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();

        for(String i : operations){
            if(i.equals("+")){
                int a = score.pop();
                int b = score.peek();
                score.push(a);
                score.push(a+b);
            }

            else if(i.equals("C")){
                score.pop();
            }
            else if(i.equals("D")){
                score.push(2*score.peek());
            }
            else{
                score.push(Integer.parseInt(i));
            }
        }

        int total =0;
        for(int val : score){
            total += val;
        }
        return total;
    }
}