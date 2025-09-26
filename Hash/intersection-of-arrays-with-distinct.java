class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        int count = 0;
        HashSet<Integer> set1=new HashSet<Integer>();
        for(int val: a){
            set1.add(val);
        }
        for(int val: b){
            if(set1.contains(val)){
                count++;
            }
        }
        return count;
    }
}
