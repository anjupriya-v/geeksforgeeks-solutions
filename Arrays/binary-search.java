class Solution {
    int binarysearch(int arr[], int n, int k) {
        int low=0,high=n-1,mid=(low+high)/2;
        while(low<=high){
            if(k==arr[mid]){
                return mid;
            }
            else if(k<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            mid=(low+high)/2;
        }
        return -1;
    }
}
