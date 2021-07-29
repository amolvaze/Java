// Write a function to check whether a given input is an integer or a string.
class Main {
  public static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
 
        return true;
    }
 
   
    public static boolean determine(String str)
    {
        
       if(str.length() == 0 || str == null) return false;
        if (isNumber(str)){
            return true;
        }
        else {
            return false;
        }
    }


public static void main(String[] args) {
 String str = "";
 System.out.println(determine(str));
  
}
}
