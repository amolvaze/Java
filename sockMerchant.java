// Hacker Rank

/* 

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]


Sample Output

3

*/

public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
       int noOfPairs = 0;
       
       Set<Integer> set = new HashSet<>();
       
       for(int i=0; i < ar.size(); i++){
         if(!set.contains(ar.get(i))) {
            set.add(ar.get(i));
         }
         else {
            noOfPairs++;
            set.remove(ar.get(i));
         }
       }
       
       return noOfPairs;
    }
