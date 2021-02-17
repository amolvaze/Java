// Remove element from an array in place - without modifying.

// Time complexity : O(n)O(n). Both ii and nn traverse at most nn steps. 
//In this approach, the number of assignment operations is equal to the number of elements to remove. So it is more efficient if elements to remove are rare.

// Space Complexity - O(1) - constance space as no extra space and we are doing in place.

class Solution {
    public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
}
}
