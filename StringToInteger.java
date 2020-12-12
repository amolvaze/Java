// Code to convert given string into integer without in built function.
class Main {
 public static int convertStringToInt(String s){
   int num = 0;
   int n = s.length();
   for(int i =0; i< n; i++){
   num  = num * 10 + ((int)s.charAt(i) - 48);
   }
   return num;
 }

  public static void main(String[] args) {
    String s = "123";
    System.out.println(convertStringToInt(s));
  }
}
