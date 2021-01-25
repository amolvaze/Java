// We are given two arrays A and B of words.  Each word is a string of lowercase letters.

// Now, say that word b is a subset of word a if every letter in b occurs in a, including multiplicity.  For example, "wrr" is a subset of "warrior", but is not a subset of "world".

// Now say a word a from A is universal if for every b in B, b is a subset of a. 

// Return a list of all universal words in A.  You can return the words in any order.

// Example 1:

// Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["e","o"]
// Output: ["facebook","google","leetcode"]
// Example 2:

// Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["l","e"]
// Output: ["apple","google","leetcode"]

class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> result = new ArrayList<>();
        
        int[] max_b_freq = new int[26];
        
        for(int i=0; i< B.length; i++){
            String current_word = B[i];
            int[] char_freq = get_char_freq(current_word);
            
            for(int j= 0; j< 26; j++){
                max_b_freq[j] = Math.max(max_b_freq[j], char_freq[j]);
            }
        }
        
        
        for(int i=0; i< A.length; i++){
            String current_word = A[i];
            int[] char_counts = get_char_freq(current_word);
            
            boolean valid = true;
            for(int j =0; j< 26; j++){
                if(max_b_freq[j] > char_counts[j])
                {
                    valid = false;
                } 
            }
            
            if(valid) result.add(current_word);
        }
        
        return result;
    }
    
    public int[] get_char_freq(String S){
        int[] result = new int[26];
        for(char c: S.toCharArray()){
            result[c-'a']++;
        }
        
        return result;
    }
}
