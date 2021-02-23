class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min_val = A[0];
        int max_val = A[0];
        
        for(int i=0 ; i < A.length; i++){
            min_val = Math.min(min_val, A[i]);
            max_val = Math.max(max_val, A[i]);
        }
        
        if(min_val + K >= max_val-K ){
            return 0;
        }
        else {
            return (max_val-K) -(min_val + K);
        }
    }
}
