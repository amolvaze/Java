// Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
    
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.

class Main {
    public static int[] plusOne(int[] digits) {
     
     int n = digits.length;

     for(int i= n-1; i>=0; i--){
       if(digits[i] < 9){
         digits[i]++;
         return digits;
       }

       digits[i] =0;
     }
  
    int[] num = new int[n+1];
    num[0] = 1;
    return num;
    }
  public static void main(String[] args) {
    int[] digits = {1,2,3};
    System.out.println(plusOne(digits));
    for(int i = 0; i< digits.length; i++){
      System.out.println(digits[i]+" ");
    }
  }
}
