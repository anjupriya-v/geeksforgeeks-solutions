class GfG
{
    void printPat(int n)
    {
         for(int i=n;i>0;i--){
             for(int j=n;j>0;j--){
                 for(int k=0;k<i;k++){
                     System.out.print(j+" ");
                 }
             }
             System.out.print("$");
         }
    }
}
// Input: 2
// Output:
// 2 2 1 1 $2 1 $
