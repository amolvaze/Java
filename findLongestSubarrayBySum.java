public static void findLongestSubArrayBySum(int s, int[] arr){
 
 int[] result = new int[] {-1};

 int sum=0;
 int left=0;
 int right= 0;

 while(right < arr.length){
 sum += arr[right];
 while(left < right && sum > s){
   sum -= arr[left++];
 }
 if(sum == s && (result.length == 1 || result[1] - result[0] < right - left)) {
   result = new int[] {left + 1, right + 1 };  
 }
 right++;
 }
 for(int i=0; i< result.length; i++){
  System.out.println(result[i]+" ");
 }
 }


  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,0,0,0,6,7,8};
              // 0 1 2 3 4 5 6 7 8 9 10
    int s = 15;
    findLongestSubArrayBySum(s, arr);
  }
}
