


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
