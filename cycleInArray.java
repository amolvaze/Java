// code to detect cycle in the given array 

// Time - O(n) and Space - O(1)

class Main {
  public static int countCyclesBurn(int[] data) {
    if(data.length == 0 || data == null) {
      return -1;
    }
    int index = 0;
    int count = 0;
    while(data[index] >= 0) {
        int tmp = data[index];
        data[index] = -(++count);
        index = tmp;
    }
    return count + data[index] + 1;
}
  public static void main(String[] args) {
   int[] arr = {1,2,1};
   System.out.println(countCyclesBurn(arr));
  }
}
