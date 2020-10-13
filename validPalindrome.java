// Code for only alphanumeric characters.
class Solution {
    public boolean isPalindrome(String s) {
        String fixed_String= "";
        for(char c: s.toCharArray()){
        if(Character.isDigit(c) || Character.isLetter(c)){
            fixed_String +=c;
          }
        }
       
        fixed_String = fixed_String.toLowerCase();
        int a_pointer=0;
        int b_pointer= fixed_String.length() -1;
        while(a_pointer <= b_pointer){
        if(fixed_String.charAt(a_pointer) != fixed_String.charAt(b_pointer)){
            return false;
        }
            a_pointer+=1;
            b_pointer-=1;
        }
        
      return true;  
    }
}
