import java.util.*;

// code to find the unique email addresses using hashset approach.
// Time and Space Complexity - O(C)- where c = total contents of an email.
/*
Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
*/


class Main {
  public static int numUniqueEmails(String[] emails) {
  
  HashSet<String> unique_emails = new HashSet<>();
 
  for(String email : emails)
   {
   // split given email into two parts before and after @
     int split_position = email.indexOf("@");
     String local_name = email.substring(0, split_position);
     String domain_name = email.substring(split_position);

   // now we need to fix + sign
   if(local_name.contains("+"))
   {
     int plus_position = local_name.indexOf("+");
     local_name = local_name.substring(0, plus_position);
   } 
   
  // Now we get period('.') we need to replace it with empty string
  local_name = local_name.replaceAll("\\.", "");
  // create result and add to the hashet to return
  String  resultString = local_name + domain_name;
  unique_emails.add(resultString); 
   }

   return unique_emails.size();
  
  }
  public static void main(String[] args) {
    String[] str = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"} ;
    System.out.println(numUniqueEmails(str));
  }
}
