class Solution {
    public long findMaxProduct(List<Integer> arr) {
        int neg_count = 0, zero_count = 0, mini_abs_value = Integer.MIN_VALUE;
        long prod = 1;
        
        if (arr.size() == 1) {
            return arr.get(0);
        }
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                zero_count++;
                continue;
            }
            
            if (arr.get(i) < 0) {
                neg_count++;
                mini_abs_value = Math.max(arr.get(i), mini_abs_value);
            }
            
            prod = (prod * arr.get(i)) % 1000000007;
        }
        
        if (zero_count == arr.size()) {
            return 0;
        }
        
        if (neg_count % 2 != 0) { // checking whether negative count is odd
            if (neg_count == 1 && zero_count > 0 && (neg_count + zero_count) == arr.size()) {
                return 0;
            }
            prod = prod / mini_abs_value; 
        }

        return prod;
    }
}
