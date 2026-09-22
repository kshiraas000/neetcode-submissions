class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        String clean = lower.replaceAll("[^a-z0-9]", "");

        int i = 0;
        int j = clean.length() - 1;

        while (i < j) {
            if(clean.charAt(i) != clean.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
