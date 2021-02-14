class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
      
        int clockWiseDist = 0;
        int totalDist =0;
        
        for(int i=0; i< distance.length; i++){
            if(start < destination && (i >=start && i < destination)){
                clockWiseDist += distance[i];
            }
            
             if(start > destination && (i >=start || i < destination)){
                clockWiseDist += distance[i];
            }
            
            
            totalDist += distance[i];
        }
        
     return Math.min(clockWiseDist, totalDist-clockWiseDist);
    }
}
