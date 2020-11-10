//Subdomain visit count

/*
Example 1:
Input: 
["9001 discuss.leetcode.com"]
Output: 
["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
Explanation: 
We only have one website domain: "discuss.leetcode.com". 
As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.
*/

// Time Complexity - O(n) and Space complexity - O(n)

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap();
        for(String domain : cpdomains ){
     int hints = Integer.parseInt(domain.substring(0, domain.indexOf(" ")));
     String curr = domain.substring(domain.indexOf(" ") + 1);
            while(! curr.isEmpty()){
           counts.put(curr, counts.getOrDefault(curr, 0) + hints);
            int index = curr.indexOf(".");
             if(index != -1){
                 curr = curr.substring(index+1);
             }else {
                curr = "";
             }
            }
        }
        
     List<String> result = new ArrayList();
      for(String key : counts.keySet()){
          int count = counts.get(key);
          String toadd = count + " " + key;
          result.add(toadd);
      }
     return result;  
    }
}
