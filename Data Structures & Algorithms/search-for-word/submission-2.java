class Solution {
    public boolean exist(char[][] board, String word) {
        int pointer = 0;
        Set set = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, pointer)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int pointer) {
        // base case?
        if (pointer == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(pointer) || board[i][j] == '#') {
            return false;
        }

        board[i][j] = '#';

        boolean result = dfs(board, word, i + 1, j, pointer + 1) ||
                         dfs(board, word, i - 1, j, pointer + 1) ||
                         dfs(board, word, i, j + 1, pointer + 1) ||
                         dfs(board, word, i, j - 1, pointer + 1);

        board[i][j] = word.charAt(pointer);
        return result;

    }
}
