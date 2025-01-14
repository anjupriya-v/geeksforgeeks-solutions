class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        
        Set<Integer> aArrWithoutDuplicates = new HashSet<Integer>();
        
                
        if(a.length == 0 || b.length == 0){
            return false; 
        }
        
       for(int i:a){
           aArrWithoutDuplicates.add(i);
       }
       
       for(int i:b){
           if(!aArrWithoutDuplicates.contains(i)){
               return false;
           }
       }
        
        return true;
    }
}
