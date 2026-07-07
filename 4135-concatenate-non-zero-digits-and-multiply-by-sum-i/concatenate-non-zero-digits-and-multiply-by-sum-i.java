class Solution {
    public long sumAndMultiply(int n) {
        long sum =0;
        long num = 0;

        long a =0;

        while(n != 0){
            a = n%10;
            if(a != 0){
                sum += a;
                num = num*10 + a;
            }
            n /= 10;
        }
        long r = 0;

        while(num != 0){
            long d = num%10;
            r = r*10 + d;
            num /= 10;
        } 
        return r*sum;
    }
}