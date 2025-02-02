class Solution {
    static int evenlyDivides(int n) {
        int temp_n = n, count = 0;
        while(temp_n > 0){
            if(temp_n%10 != 0){
                if(n % (temp_n%10) == 0){
                    count++;
                }   
            }
            temp_n /= 10;
        }
        return count;
    }
}
