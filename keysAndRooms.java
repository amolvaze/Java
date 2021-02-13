// Example 1:

// Input: [[1],[2],[3],[]]
// Output: true
// Explanation:  
// We start in room 0, and pick up key 1.
// We then go to room 1, and pick up key 2.
// We then go to room 2, and pick up key 3.
// We then go to room 3.  Since we were able to go to every room, we return true.
    
// Time Complexity: O(N + E)O(N+E), where NN is the number of rooms, and EE is the total number of keys.

//Space Complexity: O(N)O(N) in additional space complexity, to store stack and seen.

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0]= true;
        
        Stack<Integer> keys = new Stack();
        keys.add(0);
        
       while(!keys.isEmpty()){
           int current_key = keys.pop();
           for(int new_key : rooms.get(current_key)){
               if(!seen[new_key]){
                   seen[new_key] = true;
                   keys.add(new_key);
               }
           }
       }
        
        for(boolean visited: seen){
            if(!visited) return false;
        }
        
        return true;
    }
}
