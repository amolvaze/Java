import java.util.Stack;

// Time complexity - O(2n)
// Space complexity - O(n)

class Main {

 public static String removeKdigits(String num, int k) {
  
  int size = num.length();
  if(k == size) return "0";

  Stack<Character> stack = new Stack();
  int counter=0;
  while(counter < size){
  
  while( k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(counter)){
    stack.pop();
    k--;
  }

   stack.push(num.charAt(counter));
   counter++;
  }

  while( k > 0){
    stack.pop();
    k--;
  }

  StringBuilder sb = new StringBuilder();
  while(!stack.isEmpty()){
  char current_char = stack.pop();
  sb.append(current_char);
  }

   sb.reverse();
  
  while(sb.length() > 1 && sb.charAt(0) == '0'){
    sb.deleteCharAt(0);
  }

  return sb.toString();

 } 

  public static void main(String[] args) {
    String num = "1432219";
    int k = 3;
    System.out.println(removeKdigits(num,k));
  }
}
