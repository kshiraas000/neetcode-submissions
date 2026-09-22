// 1. Get the number from the original array and store as a num/var
//     a. to get # multiply each index by appropriate
//     power of 10 and add together
// 2. add one to number
// 3. divide by appropriate powers of 10 and put in a new array

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        int[] arr = new int[digits.length+1];
        arr[0] = 1;
        return arr;
    }
}
