import java.util.*;

// code to retrun largest no - n log (n) solution

class Main {
   public static String largestNumber(int[] nums) {
        if(nums.length == 0)
            return "";
    String[] sa = new String[nums.length];
    for(int i=0; i< nums.length; i++)
    {
        sa[i] = Integer.toString(nums[i]);
    }
        
    // sort using comprator
     Arrays.sort(sa, new Comparator<String>() {
                public int compare(String a, String b)
                 {
                     String o1 = a+b;
                     String o2 = b+a;
                     return o2.compareTo(o1);
                }});
        
     if(sa[0].equals("0"))
         return "0";
     
        StringBuilder sb = new StringBuilder();
         
        for(String s: sa)
        {
            sb.append(s);
        }
        
      return sb.toString();
    }
  public static void main(String[] args) {
    int[] arr = {10,2};
    System.out.println(largestNumber(arr));
  }
}
