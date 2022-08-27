class Solution {
    void rearrange(int arr[], int n) {
        ArrayList<Integer> pos=new ArrayList<Integer>();
        ArrayList<Integer> neg=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        int i=0,j=0,index=0;
        while(true){
            if(i<pos.size()){
                arr[index]=pos.get(i);
                index++;
                i++;
            }
            if(j<neg.size()){
                arr[index]=neg.get(j);
                index++;
                j++;
            }
            if(i>pos.size()-1 && j>neg.size()-1){
                break;
            }
        }
    }
}
