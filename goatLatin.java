class Solution {
    public String toGoatLatin(String S) {
      
        HashSet<Character> vowels = new HashSet();
        for(char c : "aeiouAEIOU".toCharArray()){
            vowels.add(c);
        }
        
        String result = "";
        int index = 1;
        
        for(String word : S.split("\\s")) {
            
            // logic to add spaces after the first letter
            if(index > 1 ){
                result += " ";
            }
            
            char first_letter = word.charAt(0);
            if(vowels.contains(first_letter)){
                // rule -1 if the first letter is vowel
                result += word + "ma";
            }
            else {
                // rule -2 - if the first letter is consonant.
                result += word.substring(1) + first_letter + "ma";
            }
            
            // logic to handle leftover spaces - rule -3
            for(int j =0; j < index; j++){
                result += "a";
            }
            
            index += 1;
        }
        
        
        return result;
    }
}
