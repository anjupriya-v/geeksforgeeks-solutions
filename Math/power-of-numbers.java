class Solution {
    public int reverseExponentiation(int n) {
        return (int)Math.pow(n,findReverse(n));
    }
    static int findReverse(int n){
        String res = "";
        while(n > 0){
            if(n%10 == 0){
                n/=10;
                continue;
            }
            res+=n%10;
            n/=10;
        }
        return Integer.parseInt(res);
    }
}
