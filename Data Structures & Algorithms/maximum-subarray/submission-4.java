// 1. create two pointers, left and right
//     a. left pointer starts at index 0, right at index 1
// 2. create currSum and maxSum vars
//     a. init curr sum by adding left and right pointers and 
//     max sum by setting it equal to curr sum 
// 3. move right pointer to right until it reaches end of array
//     a. update curr sum and maxsum as pointers move
//     b. if value at right pointer is greater than curr pointer 
//     move left pointer to right then continue moving right and 
//     calculating curr and max sum
// 4. return max sum

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        else {
            int left = 0;
            int right = 1;
            int currSum = nums[0];
            int maxSum = currSum;
            while (right < nums.length) {
                currSum += nums[right];
                if (nums[right] > currSum) {
                    left = right;
                    currSum = nums[left];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                right++;
            }
            return maxSum;
        }
        
    }
}





