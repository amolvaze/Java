import java.util.*;

// code for the parition labels
/*Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
*/

//Time Complexity: O(N)O(N), where NN is the length of SS.

//Space Complexity: O(1)O(1) to keep data structure last of not more than 26 characters.

class Main {
 public static List<Integer> partitionLabels(String S) {
    if(S==null || S.length() == 0) return null;
   
   List<Integer> result = new ArrayList();
   int[] indices = new int[26];

   for(int i=0; i< S.length(); i++)
   {
      indices[S.charAt(i)- 'a'] = i;
   }

   int start =0;
   int end =0;
 
   for(int i=0; i<S.length(); i++){
     end = Math.max(end , indices[S.charAt(i)- 'a']); 
     if(end == i)
     { 
       result.add(end-start+1);
       start = end+1;
     }
   }


 return result;
 }

  public static void main(String[] args) {
    String str = "ababcbacadefegdehijhklij";
    System.out.println(partitionLabels(str));
  }
}
