// if no is 9520 - output is 9520
// if no is 41194 output is 94411

import java.util.*;

class Main {
public static int largestNumber(int data){
char[] digits = String.valueOf(data).toCharArray();
Arrays.sort(digits);
// needs to be in descending order
for(int i = 0; i < digits.length / 2; i++) {
    char t = digits[i];
    digits[i] = digits[digits.length -i - 1];
    digits[digits.length -i - 1] = t;
}
return Integer.parseInt(new String(digits));
}
  public static void main(String[] args) {
    int num = 41194;
    System.out.println(largestNumber(num));
  }
}
