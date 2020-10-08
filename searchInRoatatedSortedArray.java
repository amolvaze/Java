// code for search in rotated sorted array.

class Solution {
    public int search(int[] nums, int target) {
     
   if(nums.length == 0|| nums == null) return -1;
    int left = 0;
    int right = nums.length-1;
    while(left < right) {
    int midpoint = left + (right - left) /2;
    if(nums[midpoint] > nums[right])
    left = midpoint + 1;
        else {
    right = midpoint;
        }
        
    }
        
     int start = left;
     left = 0;
     right = nums.length-1;
    
     if(target >= nums[start] && target <= nums[right]) {
         left = start;
     }else
     {
         right = start;
     }
        
        while(left <=right) {
        
            int midpoint = left + (right - left)/2;
            if(nums[midpoint] == target) {
                return midpoint;
            }
            else if (nums[midpoint] < target) {
                left = midpoint + 1;
            }
            else {
                right = midpoint -1;
            }
        }
        
      return -1;
        
    }
}


// Another Approach

class Solution {
    public int search(int[] nums, int target) { 
        if(nums.length == 0|| nums == null) return -1;
        int left = 0;
        int right = nums.length-1;
        int mid;
        while(left<=right)
        {
            mid = (left+right)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>=nums[left])
            {
                if(target<=nums[mid] && target>=nums[left])
                    right = mid-1;
                else
                    left = mid+1;
            }
            else
            {
                if(target>=nums[mid] && target<=nums[right])
                    left = mid+1;
                else
                    right = mid-1;
            }
        }
        return -1;
    }
}

