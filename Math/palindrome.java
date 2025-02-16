class Solution {
    public boolean isPalindrome(int n) {
        String res = "";
        int temp = n;
        while(temp > 0){
            res+= temp%10;
            temp /= 10;
        }
        if(Integer.parseInt(res) == n){
            return true;
        }
        return false;
    }
}
