class Solution {
    int findMaximum(int[] arr, int n) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(i<n-1 && arr[i+1]-arr[i]<0){
                max=arr[i];
                break;
            }
            if(i==n-1 && arr[i-1]-arr[i]<0){
                max=arr[i];
            }
        }
        return max;
    }
}
