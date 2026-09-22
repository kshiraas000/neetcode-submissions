class Solution {
    public int jump(int[] nums) {
        // if size of nums is 1 return 0
        // define a pointer curr at end of array
        // change value at nums[curr] to zero
        // subtract 1 from curr
        // create new pointer to lookahead count
        
        // look at value at curr and move count pointer forward 
        // as many steps as are in the value at curr or until you reach the end of array

        // change the value at curr to minimum of count iteration
        // subtract from curr and move count to curr

        // loop until curr reaches 0 index

        // return value at index 0

        if (nums.length == 1) {
            return  0;
        }

        nums[nums.length - 1] = 0;
        int curr = nums.length - 2;
        int count = curr;

        while (curr >= 0) {
            int min = 1000; //idk if this is right
            while (count < curr + nums[curr] && count < nums.length - 1) { // idk if this is right
                count++;
                min = Math.min(min, nums[count]);
            }
            
            nums[curr] = min + 1;
            curr--;
            count = curr;
        }

        return nums[0];
    }
}
