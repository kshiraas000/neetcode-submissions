class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] indices = new int[2];

        while (numbers[start] + numbers[end] != target) {
            if (numbers[start] + numbers[end] > target) {
                end--;
            }
            if (numbers[start] + numbers[end] < target) {
                start++;
            }
        }
        indices[0] = start + 1;
        indices[1] = end + 1;
        return indices;
    }
}
