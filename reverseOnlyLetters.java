class Solution {
//     public String reverseOnlyLetters(String S) {
//         // Stack approach
//         Stack<Character> stack = new Stack();
        
//         // Loop thru given input
        
//         for (int i= 0; i< S.length(); i++) {
//             if(Character.isLetter(S.charAt(i))) {
//                 stack.push(S.charAt(i));
//             }
//         }
        
//         StringBuilder sb = new StringBuilder();
        
//         for(int i=0; i< S.length(); i++) {
//             if(Character.isLetter(S.charAt(i))) {
//                 sb.append(stack.pop());
//             }
//             else{
//                 sb.append(S.charAt(i));
//             }
//         }
       
//         return sb.toString();
        
//     }
    
    // Another approch using counter
     public String reverseOnlyLetters(String S) {
        
         StringBuilder sb = new StringBuilder();
         int j=S.length()-1;
         
         // Loop thru the string input
         
         for(int i=0; i< S.length(); i++) {
             if(Character.isLetter(S.charAt(i))) {
                while(!Character.isLetter(S.charAt(j))) {
                    j--;
                }
                 sb.append(S.charAt(j));
                 j--;
           }
          else{
               sb.append(S.charAt(i));
           }
         }
         
         return sb.toString();
     }
       
}
