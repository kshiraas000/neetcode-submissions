class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;

        int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    int island = dfs(grid, r, c);
                    max = Math.max(island, max);
                }
            }
        }

        return max;
    }

    
    public int dfs (int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length 
        || grid[r][c] == 0) {
            return 0;
        }

        grid[r][c] = 0; // mark as visited
        int count = 1;

        count += dfs(grid, r - 1, c);
        count += dfs(grid, r, c - 1);
        count += dfs(grid, r + 1, c);
        count += dfs(grid, r, c + 1);

        return count;
    }
}
