class Solution {
    public void rotate(int[] arr) {
        // code here
        int last = arr[arr.length - 1];
        for(int i=arr.length - 1; i >= 0 ; i--){
            if(i == 0){
                arr[i] = last;
                break;
            }
            arr[i] = arr[i-1];
        }
    }
}
