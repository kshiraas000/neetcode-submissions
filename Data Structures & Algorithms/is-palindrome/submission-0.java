class Solution {
    public boolean isPalindrome(String s) {
        String noSpace = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int startPointer = 0;
        int endPointer = noSpace.length() - 1;

       while(startPointer < endPointer) {
            if(noSpace.charAt(startPointer) != noSpace.charAt(endPointer)) {
                return false;
            }
            startPointer ++;
            endPointer --;
        }
        return true;
    }
}
