import java.util.*;
// code to check if one string is anagram of other
class Main {
  private static int range= 256;
  // O(n log n) solution. 
  //  public static boolean checkAnagram(String s, String t){
  //     // find length of both the strings
  //     int n1= s.length();
  //     int n2 = t.length();
  //   // System.out.println(n1);
  //   // System.out.println(n2);
  //   if(n1!=n2) {
  //     System.out.println("Given strings are not anagram.");
  //     return false;
  //   }
    
  //   char[] arr1 = s.toCharArray();
  //   char[] arr2 = t.toCharArray();
  //   Arrays.sort(arr1); // n log n
  //   Arrays.sort(arr2);
  //  // System.out.println(arr1);
  //  // System.out.println(arr2);
  //  return Arrays.equals(arr1, arr2); 
     
    
  //       //return true; 
  //   } 

  // O(n) approach
public static boolean checkAnagramStrings(String s, String t) {
    //find length of both the strings
 int n1= s.length();
      int n2 = t.length();
    if(n1!=n2) {
      return false;
    }
int[] resultArray = new int[range];
// increament count in first string and decreament in second string if both strings are anagrams then count will be zero
for(int i= 0; i< s.length(); i++){
    resultArray[s.charAt(i)]++;
    resultArray[t.charAt(i)]--;
}
// looping through to find if count is not zero.
for(int j=0; j< range; j++){
  if(resultArray[j] != 0) {
     return false;
  }
  
}
   return true; 
  }

  public static void main(String[] args) {
   // int[] arr = {1,1,2};
    //removeDuplicates(arr);
  // String s1 = "rat";
  //  String s2= "car";
  String s1 = "anagram";
  String s2= "nagaram";
  //System.out.println(checkAnagram(s1,s2));
  System.out.println(checkAnagramStrings(s1,s2));
  }
}


// JavaScript Logic

const anagram = (s,t) => {

 //const count RANGE = 256;
let range = 256; 
let n1= s.length
console.log(n1)
let n2=  t.length
console.log(n2)
if(n1 !== n2) return false;

var counts = {};

  for(let i = 0; i < n1; i++) {
    let index = s.charCodeAt(i)-97;
    counts[index] = (counts[index] || 0) + 1;
  }

  // console.log(counts)

  for(let j = 0; j < n2; j++) {
    let index = t.charCodeAt(j)-97;
    if (!counts[index]) { 
      return false; 
    }
    counts[index]--;
  }

  return true;
 }









