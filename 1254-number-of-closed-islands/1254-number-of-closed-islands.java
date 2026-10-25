class Solution {
    private static final int[] DIRECTIONS = { -1, 0, 1, 0, -1 };

    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int r = 0; r < m; r++) {
            flood(grid, r, 0);
            flood(grid, r, n - 1);
        }

        for (int c = 0; c < n; c++) {
            flood(grid, 0, c);
            flood(grid, m - 1, c);
        }

        int answer = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 0) {
                    answer++;
                    flood(grid, r, c);
                }
            }
        }

        return answer;
    }

    private void flood(int[][] grid, int sr, int sc) {
        if (grid[sr][sc] != 0) {
            return;
        }

        int m = grid.length;
        int n = grid[0].length;

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(sr * n + sc);
        grid[sr][sc] = 1;

        while (!stack.isEmpty()) {
            int id = stack.pop();
            int row = id / n;
            int col = id % n;

            for (int d = 0; d < 4; d++) {
                int nr = row + DIRECTIONS[d];
                int nc = col + DIRECTIONS[d + 1];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n &&
                        grid[nr][nc] == 0) {
                    grid[nr][nc] = 1;
                    stack.push(nr * n + nc);
                }
            }
        }
    }
}