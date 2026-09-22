class Solution {
    public boolean canJump(int[] nums) {
        // Define left and right pointers
        // left pointer one away from last element
        // right pointer at last element
        // create var dist for distance from right pointer and initialize to 1
        // if element at left pointer is greater than or equal to dist move right 
        // to left and move left down one and reset dist to 1
        // if element at left pointer is less than dist, decrement left and inc dist and compare again
        // repeat and if right reaches first element return true
        // otherwise return false
        // loop until left pointer reaches first element
        // if nums size = 1 return true

        if (nums.length == 1) {
            return true;
        }

        int left = nums.length - 2;
        int right = nums.length - 1;

        int dist = 1;

        boolean ans = false;

        while (left >= 0) {
            if (nums[left] >= dist) {
                right = left;
                left--;
                dist = 1;
            } else {
                left--;
                dist++;
            }
        }

        if (right == 0) {
            ans = true; 
        }

        return ans;
    }
}
