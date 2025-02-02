class Solution {
    public int reverseDigits(int n) {
        String res = "";
        while(n>0){
            if(n%10 == 0){
                n/=10;
                continue;
            }
            res += n%10;
            n/=10;
        }
        return Integer.parseInt(res);
    }
}
