// Input: 
// paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
// banned = ["hit"]
// Output: "ball"
// Explanation: 
// "hit" occurs 3 times, but it is a banned word.
// "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
// Note that words in the paragraph are not case sensitive,
// that punctuation is ignored (even if adjacent to words, such as "ball,"), 
// and that "hit" isn't the answer even though it occurs more because it is banned.

// Time complexity - O(n)

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> banned_words = new HashSet();
        HashMap<String , Integer> valid_wordCounts = new HashMap();
        
        for(String banned_word: banned){
            banned_words.add(banned_word);
        }
        
        String[] words = paragraph.toLowerCase().split("\\W+");
        for(String word : words ){
            if(!banned_words.contains(word)){
            valid_wordCounts.put(word, valid_wordCounts.getOrDefault(word,0) + 1);    
            }
        }
        
        int max = 0;
        String result = "";
        for(String word : valid_wordCounts.keySet()){
            if(valid_wordCounts.get(word) > max){
                max = valid_wordCounts.get(word);
                result = word;
            }
        }
        
        return result;
    }
}
