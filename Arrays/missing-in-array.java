// Problem link - https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
class Solution {
    int missingNumber(int arr[]) {
        Arrays.sort(arr);
        for(int i = 1; i <= arr.length; i++){
            if(arr[i-1] != i){
                return arr[i-1]-1;
            }
        }
        return arr[arr.length-1] + 1;
    }
}
