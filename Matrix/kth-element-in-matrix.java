class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
	    List<Integer> list=new ArrayList<Integer>(); 
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}
