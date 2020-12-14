// # Write a function top_k_words(phrase, k) that returns the K most common words in a given phrase.
// # >>> example = 'once thrice twice thrice twice thrice'
// # In the example phrase above, we have "once" once, "thrice" three times, and "twice" twice.
 
// # If k=1, return the most common word, in this case "thrice".
// # >>> top_k_words(phrase=example, k=1)
// # ['thrice']
  
// # If k=2, return the two most common words in order of most common to least common.
// # >>> top_k_words(phrase=example, k=2)
// # ['thrice', 'twice']
  
// # If k=3, return the three most common words in order of most common to least common.
// # >>> top_k_words(phrase=example, k=3)
// # ['thrice', 'twice', 'once']
  
// # If k is greater than the number of different words, return all the words in order of most common to least common.
// # >>> top_k_words(phrase=example, k=4)
// # ['thrice', 'twice', 'once']
 
// # What do you think is the right thing to do if k=0?

// Time Complexity - O(n log k) 

class Solution {
   public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap();
        for (String word: words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        List<String> candidates = new ArrayList(count.keySet());
        Collections.sort(candidates, (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                w1.compareTo(w2) : count.get(w2) - count.get(w1));

        return candidates.subList(0, k);
}
}
