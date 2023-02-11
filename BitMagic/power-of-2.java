class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        int i=0;
        while(Math.pow(2,i)<=n){
            if(Math.pow(2,i)==n){
                return true;
            }
            i++;
        }
        return false;
        
    }
    
}
