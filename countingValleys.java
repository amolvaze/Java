// HackerRank

/* Constraints

Sample Input

8
UDDDUDUU
Sample Output

1 */

 public static int countingValleys(int steps, String path) {
    // Write your code here
          
          int altitude = 0;
          int noOfValleys= 0;
          
          for(int i =0; i < steps; i++){
            if(path.charAt(i) == 'U') {
                if(altitude == -1) {
                    noOfValleys++;
                }
                altitude++;
            }
            
            if(path.charAt(i) == 'D') {
                altitude--;
            }
            
          }
          
          return noOfValleys;
    }
