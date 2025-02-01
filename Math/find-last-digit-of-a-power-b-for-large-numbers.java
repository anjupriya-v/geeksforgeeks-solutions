class Solution {
    static int getLastDigit(String a, String b) {
        // Short Approach - return new BigInteger(a).modPow(new BigInteger(b), BigInteger.TEN).intValue(); 
        return findRepeatingCycleAndComputeLastDigit(new BigInteger(a),new BigInteger(b)) % 10;
    }
    static BigInteger findRepeatingCycleAndFindRem(BigInteger a,BigInteger b){
        //finding repeating cycles
        switch(a.mod(BigInteger.valueOf(10)).intValue()){
            case 2:
            case 3:
            case 7:
            case 8:
             if(b.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO)){
                return BigInteger.valueOf(4);
             };
             return b.mod(BigInteger.valueOf(4));
            case 4:
            case 9: 
                if(b.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
                    return BigInteger.valueOf(2);
                };
                return b.mod(BigInteger.valueOf(2));
            case 5: 
            case 6:
              return BigInteger.valueOf(1);
            default:
                return BigInteger.valueOf(0);
        }
    }

    static int findRepeatingCycleAndComputeLastDigit(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)){
            return 1;
        }
        if(a.equals(BigInteger.ZERO)){
            return 0;
        }
        if(a.mod(BigInteger.valueOf(10)).equals(BigInteger.ZERO)){
            return 0;
        }
        return a.mod(BigInteger.TEN).pow(findRepeatingCycleAndFindRem(a, b).intValue()).intValue(); 
    }
};
