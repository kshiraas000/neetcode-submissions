class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int water = 0;
        
        for (int right = 0; right < height.length; right++) {
            while (!stack.isEmpty() && height[right] >= height[stack.peek()]) {
                int bottom = stack.pop();
                
                if (stack.isEmpty()) break;
                
                int left = stack.peek();
                int width = right - left - 1;
                int h = Math.min(height[left], height[right]) - height[bottom];
                water += width * h;
            }
            stack.push(right);
        }
        
        return water;
    }
}