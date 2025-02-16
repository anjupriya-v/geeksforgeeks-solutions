class Solution {
    static boolean armstrongNumber(int n) {
        int sum = 0,temp = n;
        while(temp > 0){
            sum+= Math.pow(temp%10,3);
            temp/=10;
        }
        if(sum == n){
            return true;
        }
        return false;
    }
}
