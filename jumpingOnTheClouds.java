// Hacker rank
public static int jumpingOnClouds(List<Integer> c) {
    // Write your code here
    int i=0;
    int noOfJumps =0;
    Integer[] c1 = c.toArray(new Integer[0]);
    while( i < c1.length -1) {
        if(i+2 == c1.length || c1[i +2 ] == 1) {
            i++;
            noOfJumps++;
        }
        else {
            i +=2;
            noOfJumps++;
        }
    }
       return noOfJumps;
    }

}
