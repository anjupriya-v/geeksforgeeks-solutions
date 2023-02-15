class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int i=0,value=Integer.MAX_VALUE,max=0;
        while(i<n && value!=0){
            for(int j=i;j<(i+k);j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            list.add(max);
            max=0;
            value=(n-1-i)-(k-1);
            i++;
        }
        return list;
    }
}
