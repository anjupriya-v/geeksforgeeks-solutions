class Compute {
    
    public void Rearrange(long a[], long n)
    {
       List<Long> pos=new ArrayList<Long>();
       List<Long> neg=new ArrayList<Long>();
       for(int i=0;i<n;i++){
           if(a[i]>=0){
               pos.add(a[i]);
           }
           else{
               neg.add(a[i]);
           }
       }
       int negLen=neg.size(),negIndex=0,posIndex=0;
       for(int i=0;i<n;i++){
           if(negLen>0){
               a[i]=neg.get(negIndex);
               negIndex++;
               negLen--;
           }
           else{
              a[i]=pos.get(posIndex);
              posIndex++; 
           }
       }
    }
}
