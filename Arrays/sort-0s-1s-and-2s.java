class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        
        int low = 0, mid = 0, high = arr.length - 1,temp = 0;
        while(mid <= high){
            if(arr[mid] == 0){
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;                
                high--;
            }
        }
        
    }
    
}
