class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean = re.sub(r"[^a-z0-9]", "", s.lower())
        l = 0
        r = len(clean) - 1

        while l <= r:
            if clean[l] != clean[r]:
                return False
            l = l + 1
            r = r - 1
        
        return True
