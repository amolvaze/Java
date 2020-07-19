import java.util.*;

// code for the best time to buy and sell stock in linear time.


// Input: [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//              Not 7-1 = 6, as selling price needs to be larger than buying price.

// Input: [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transaction is done, i.e. max profit = 0.

class Main {
  public static int maxProfit(int[] prices) { 
   int min_val = Integer.MAX_VALUE;
   int max_profit = 0;
  for(int i=0; i< prices.length; i++ ){
    if(prices[i] < min_val) {
      min_val = prices[i];
    }else if(prices[i] - min_val > max_profit) {
      max_profit = prices[i] - min_val;
    }
  }

    return max_profit;

  }
  public static void main(String[] args) {
   int[] arr = {7,1,5,3,6,4};
    //int[] arr = {7,6,4,3,1};
    System.out.println(maxProfit(arr));
  }
}
