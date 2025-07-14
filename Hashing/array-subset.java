class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i: a){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(int i: b){
            if(!hm.containsKey(i) || hm.get(i) == 0){
                return false;
            }
            hm.put(i,hm.get(i)-1);
        }
        return true;
    }
}

// Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
// Output: true
// Explanation: b[] is a subset of a[]
