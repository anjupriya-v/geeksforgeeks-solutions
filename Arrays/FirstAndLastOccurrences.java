class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> list=new ArrayList<Long>();
        int flag=1;
        long lastIndex=0,temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x && flag==1){
                flag=0;
                temp=Long.valueOf(i);
                list.add(Long.valueOf(i));
            }
            if(arr[i]==x && flag==0){
                lastIndex=i;
            }
        }
        if(flag==1){
            list.add(Long.valueOf(-1));
            list.add(Long.valueOf(-1));
            return list;
        }
        if(flag==0 && lastIndex==0){
            list.add(temp);
            return list;
        }
        list.add(lastIndex);
        return list;
    }
}
