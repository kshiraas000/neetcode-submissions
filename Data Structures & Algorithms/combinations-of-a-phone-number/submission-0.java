class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();

        List<String> res = new ArrayList<>();

        res.add("");

        String[] digitsToChar = {
            "", "", "abc", "def", "ghi", "jkl", 
            "mno", "pqrs", "tuv",   "wxyz"
        };

        for (char digit : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            for (String str : res) {
                for (char c : digitsToChar[digit - '0'].toCharArray()) {
                    temp.add(str + c);
                }
            }
            res = temp;
        }

        return res;
    }
}
