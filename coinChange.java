import java.util.*;

// code for coin chage using dynamic programming

// Time complexity -  O(n * amount)

// Space Complexity - O(amount)

class Main {

  public static int coinChange(int[] coins, int amount) {
    if(amount == 0 || coins.length == 0)
     return 0;
  
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    dp[0] =0;

    for(int i =0 ; i< coins.length; i++)
    {
      for(int j = coins[i]; j <=amount; j++)
      {
     dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
      }
    }

    return dp[amount] == amount + 1 ? -1 : dp[amount];

  }

  public static void main(String[] args) {
    int[] arr = {1,2,5};
    int amount =11;
    // int[] arr = {2};
    // int amount =3;
    System.out.println(coinChange(arr, amount));
  }
}
