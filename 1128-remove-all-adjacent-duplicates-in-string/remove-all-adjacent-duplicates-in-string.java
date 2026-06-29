class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(c);

            }
        }
        StringBuilder r = new StringBuilder();
        for(char c:stack){
            r.append(c);
        } 
        return r.toString();
    }
}