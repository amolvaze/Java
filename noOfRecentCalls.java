import java.util.*;

/*
Input: inputs = ["RecentCounter","ping","ping","ping","ping"], inputs = [[],[1],[100],[3001],[3002]]
Output: [null,1,2,3,3]
*/

class RecentCounter {
    
    Queue<Integer> queue;
    public RecentCounter() {
        // Intantiate queue inside the cosntructor. 
        queue = new LinkedList(); // queue defined as a LinkedList.
    }
    
    public int ping(int t) {
        queue.add(t);
        while(queue.peek() < t-3000){ // no of recent calls 3000 ms ago.
            queue.poll();
        
        }
         return queue.size();   
    }
    
    
}	

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
