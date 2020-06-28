import java.util.*;

// code to convert integer to roman and convert integer to roman back

// 1,4,5,9.10,40,50,90,100,400,500,900,1000
// I,IVVIX,X,XL,L,XC,C, CD,D,CM,M

class Solution {
  
  public static void integerToRoman(int num) {
   
     System.out.println("Given integer numeral: " +num);
      int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] romanLiterals ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
    StringBuilder sb = new StringBuilder();
   for(int i=0; i<=values.length-1; i++){
         while(num >= values[i]) {
             num-= values[i];
             sb.append(romanLiterals[i]);
         }
   }
   
    System.out.println("Roman for the corrospnding integer:- " +sb);
    System.out.println("----------------------------------------");
    
  }
  
  public static int romanToInteger(String s) {
  
      if(s == null || s.length() == 0){
       return -1; }
    HashMap<Character, Integer > map = new HashMap<Character, Integer>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L', 50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
    
    int len = s.length();
    int result = map.get(s.charAt(len -1));
    
   for(int i= len-2; i>=0; i--){
         if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1) )) {
            
           result += map.get(s.charAt(i));
           
         }
        else {
        result -= map.get(s.charAt(i));
        }
     
     
   }
    
    return result;
    
  }
  

  public static void main(String[] args) {
    
       integerToRoman(4);
       integerToRoman(10);
       integerToRoman(1023);
       integerToRoman(542);
    
     System.out.println("Roman to integer " +romanToInteger("IV"));
     System.out.println("Roman to integer " +romanToInteger("X"));
     System.out.println("Roman to integer " +romanToInteger("MXXIII"));
     System.out.println("Roman to integer " +romanToInteger("DXLII"));


    
  }
}