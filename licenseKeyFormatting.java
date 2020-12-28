// Input: S = "5F3Z-2e-9-w", K = 4

// Output: "5F3Z-2E9W"

// Explanation: The string S has been split into two parts, each part has 4 characters.
// Note that the two extra dashes are not needed and can be removed.

// Time complexity - O(n)

class Main {
   public static String licenseKeyFormatting(String S, int K) {
    
    S = S.toUpperCase();
    S= S.replaceAll("-","");

    StringBuilder sb = new StringBuilder(S);

    for(int i = S.length()-K; i> 0; i = i - K){
      sb.insert(i, "-");
    }

    return sb.toString();

   }

  public static void main(String[] args) {
   String s = "5F3Z-2e-9-w";
   int k = 4;
    System.out.println(licenseKeyFormatting(s,k));
  }
}
