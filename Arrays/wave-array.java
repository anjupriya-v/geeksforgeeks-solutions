class Solution {
    public static void convertToWave(int n, int[] a) {
        int temp=0,i=0;
        while(i<n-1){
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            i+=2;
        }
    }
}
