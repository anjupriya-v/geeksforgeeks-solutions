class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int freq = 0;
        for(int i = 0 ;i< arr.length; i++){
            freq = map.getOrDefault(arr[i],0);
            freq++;
            map.put(arr[i],freq);
        }
        for(int i = 1;i<= arr.length; i++){
            int value = map.getOrDefault(i,-1);
            if(value != -1){
                list.add(map.get(i));
            }
            else{
                list.add(0);
            }
        }
        return list;
    }
}
