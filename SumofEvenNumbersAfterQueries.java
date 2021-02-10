class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int S = 0;
        for (int x: A)
            if (x % 2 == 0) // if even add to the sum  //initial sum is 6 for even 
                S += x;

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0], index = queries[i][1];
            if (A[index] % 2 == 0) S -= A[index]; // subtract from initial sum
            A[index] += val;
            if (A[index] % 2 == 0) S += A[index]; // add to initial sum
            ans[i] = S;
        }

        return ans;
    }
}
