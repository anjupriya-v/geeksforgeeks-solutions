class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> set=new HashSet<Integer>();
        int i=0,j=0;
        while(i<n || j<m){
            if(i<n){
                set.add(a[i]);
            }
            if(j<m){
                set.add(b[j]);
            }
            i++;
            j++;
        }
        return set.size();
    }
}
