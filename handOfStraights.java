// Alice has a hand of cards, given as an array of integers.

// Now she wants to rearrange the cards into groups so that each group is size W, and consists of W consecutive cards.

// Return true if and only if she can.

// Note: This question is the same as 1296: https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/

 

// Example 1:

// Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
// Output: true
// Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
// Example 2:

// Input: hand = [1,2,3,4,5], W = 4
// Output: false
// Explanation: Alice's hand can't be rearranged into groups of 4.

class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
     
        if(hand.length % W != 0) return false;
        
        TreeMap<Integer, Integer> card_counts = new TreeMap<>();
        
        for(int card : hand){
            if(!card_counts.containsKey(card)){
                card_counts.put(card, 1);
            }
            else {
                card_counts.replace(card, card_counts.get(card) + 1);
            }
        }
        
        while(card_counts.size() > 0){
            int min_val = card_counts.firstKey();
            
            for(int card=min_val; card < min_val + W; card++ ){
                
                if(!card_counts.containsKey(card)) return false;
                    int count = card_counts.get(card);
                    if(count == 1) card_counts.remove(card);
                    else card_counts.replace(card, card_counts.get(card) - 1);
            }
        }
        
        return true;
    }
}
