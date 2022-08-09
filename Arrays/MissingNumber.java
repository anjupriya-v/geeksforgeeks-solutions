class Solution {
    int MissingNumber(int array[], int n) {
            int i=1,missingNumber=0,index=0;
            Arrays.sort(array);
            while(i<=n || index<array.length){
                if(index<array.length && array[index]!=i){
                    missingNumber=i;
                    break;
                }
                if(index+1>array.length){
                    missingNumber=i;
                }
                i++;
                index++;
            }
            return missingNumber;
        }
    }
