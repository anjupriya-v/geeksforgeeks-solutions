class Solution {
    int getOddOccurrence(int[] arr, int n) {
        int result=0,value=0;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                value=hm.get(arr[i]);
                hm.put(arr[i],value+1);
            }
            else{
                hm.put(arr[i],1);
            }
        } 
        for(int i:hm.keySet()){
            if(hm.get(i)%2!=0){
                result=i;
            }
        }
        return result;
    }
}
