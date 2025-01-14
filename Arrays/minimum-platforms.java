class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        int i = 0, j = 0, plt = 0, tot = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        while(i < arr.length){
            if(arr[i] <= dep[j]){
                plt++;
                i++;
            }
            else{
                plt--;
                j++;
            }
            tot = Math.max(tot,plt);
        }
        return tot;
    }
}
