class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
       ArrayList<Integer> no_duplicates = new ArrayList<Integer>();
       ArrayList<Integer> duplicates = new ArrayList<Integer>();
       for(int val: arr){
           if(no_duplicates.indexOf(val) == -1){
               no_duplicates.add(val);
           }
           else{
            if(duplicates.indexOf(val) == -1){
               duplicates.add(val);
            }
           }
       }
       Collections.sort(duplicates);
       if(duplicates.size() == 0){
           duplicates.add(-1);
       }
       return duplicates;
    }
}
