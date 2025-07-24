class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        if(arr.length < 2){
            return false;
        }
        HashSet<Integer> list = new HashSet<>();
        for(int i=0;i<arr.length; i++){
            if(list.contains(target-arr[i])){
                return true;
            }
            list.add(arr[i]);
        }
        return false;
    }
}
