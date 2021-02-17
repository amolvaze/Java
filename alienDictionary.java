// Time Complexity - O(C) - c- content of words 

// Space Complexity - O(n) - due to new array

class Solution {
   public int[] char_map;
    public boolean isAlienSorted(String[] words, String order) {
        char_map = new int[26];
        for(int i=0; i< order.length(); i++){
            char_map[order.charAt(i)-'a'] = i;
        }
        
        for(int i= 1; i< words.length; i++){
            if(compare(words[i-1], words[i]) > 0) // comparing hello and leetcode as an example
            {
                return false; // unsotred
            }
        }
        
      return true;  // sorted
    }
    
    public int compare(String word1, String word2){
        int i=0;
        int j =0;
        int char_compare_val=0;
        
        while(i < word1.length() && j < word2.length() && char_compare_val == 0 ){
          char_compare_val = char_map[word1.charAt(i) - 'a']-char_map[word2.charAt(j)- 'a'];
            i++;
            j++;
        }
        
        if(char_compare_val == 0){ // same length and sorted and first string length is less than second string length
          return word1.length()-word2.length();  
        }
        else {
         return char_compare_val;
        }
    }
}

// -----------------------------------JavaScript solution-------------------------------------

/**
 * @param {string[]} words
 * @param {string} order
 * @return {boolean}
 Time Complexity : O(n) Traversing Through the entire list of words
Space Complexity : O(1) Use of a constant space hashmap
 */
const isAlienSorted = (words, order) => {
  const map = {};

  for (let i = 0; i < order.length; i += 1) {
    map[order[i]] = i;
  }

  outer:
  for (let i = 0; i < words.length - 1; i += 1) {
    const current = words[i];
    const next = words[i + 1];
    const minLength = Math.min(current.length, next.length);

    for (let i = 0; i < minLength; i += 1) {
      if (current[i] === next[i]) continue;
      if (map[current[i]] < map[next[i]]) continue outer;
      if (map[current[i]] > map[next[i]]) return false;
    }

    if (current.length > next.length) return false;
  }

  return true;
};














