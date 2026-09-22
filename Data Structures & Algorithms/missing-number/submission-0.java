class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = nums.length; i > 0; i--) {
            sum += i;
        }
        
        int missing = sum;
        for (int num: nums) {
            missing -= num;
        }

        return missing;
    }
}
