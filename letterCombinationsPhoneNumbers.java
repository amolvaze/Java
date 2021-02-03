//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
// Example 2:

// Input: digits = ""
// Output: []
// Example 3:

// Input: digits = "2"
// Output: ["a","b","c"]

// Time complexity : \mathcal{O}(3^N \times 4^M)O(3 
// N
//  ×4 
// M
//  ) where N is the number of digits in the input that maps to 3 letters (e.g. 2, 3, 4, 5, 6, 8) 

//and M is the number of digits in the input that maps to 4 letters (e.g. 7, 9), and N+M is the total number digits in the input.

// Space complexity : \mathcal{O}(3^N \times 4^M)O(3 
// N
//  ×4 
// M
//  ) since one has to keep 3^N \times 4^M3 
// N
//  ×4 
// M
//   solutions.

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> output_arr = new LinkedList();
        if(digits.length() == 0) return output_arr;
        String[] char_map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        output_arr.add("");
        for(int i=0; i< digits.length(); i++){
         int index = Character.getNumericValue(digits.charAt(i));
         while(output_arr.peek().length() == i){
             String permutation = output_arr.remove();
             for(char c : char_map[index].toCharArray()) {
                output_arr.add(permutation + c); 
             }
         }
        }
        
        return output_arr;
    }
}
