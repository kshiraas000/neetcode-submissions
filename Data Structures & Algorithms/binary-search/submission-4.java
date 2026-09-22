class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;

        while (l < r) {
            int avg = l + (r - l) / 2;
            if (nums[avg] >= target) {
                r = avg;
            } else {
                l = avg + 1;
            }
        }

        if (l < nums.length && nums[l] == target) {
            return l;
        }
        return -1;
    }
}
