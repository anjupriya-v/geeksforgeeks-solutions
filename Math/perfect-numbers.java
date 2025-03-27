class Solution {
    static boolean isPerfectNumber(int n) {
        // code here
        int sum = 0;
        for(int i = 1; i<Math.sqrt(n); i++){
            if(n%i == 0){
                sum+=i;
                if(n/i != n){
                    sum += n/i;
                }
            }
        }
        if(sum == n){
            return true;
        }
        return false;
    }
};
