class Solution {
    int floorSqrt(int n) {
        // Your code here
         int start = 1, end = n, ans = 0;
        int mid = (start + end) /2;
        return findFloorSqrtUsingBS(start,end,mid,n, ans);
    }
    int findFloorSqrtUsingBS(int start,int end,int mid,int n, int ans){
         while (start <= end){
            if((mid * mid) > n){
                return findFloorSqrtUsingBS(start,mid - 1,(start + (mid -1))/2,n,ans);
            }
            else{
                ans = mid;
                return findFloorSqrtUsingBS(mid+1,end,((mid+1) + end)/2,n,ans);
            }
        }
        return ans;
    }
}
