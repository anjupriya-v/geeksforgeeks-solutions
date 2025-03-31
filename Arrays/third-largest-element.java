class Solution {
    int thirdLargest(int arr[]) {
        int thirdLar = -1;
        if(arr.length == 2 || arr.length == 1 || arr.length == 0){
            return -1;
        }
        Arrays.sort(arr);
        return arr[arr.length-3];
    }
}
