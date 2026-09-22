class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxCount = 0;
        char[] charArray = s.toCharArray();
        
        for (char c: charArray) {
            if(map.containsKey(c)) {
               left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            right++;

            if (right - left > maxCount) {
                maxCount = right - left;
            }
        }
        System.out.println(right);
        System.out.println(left);
        return maxCount;
    }
}
