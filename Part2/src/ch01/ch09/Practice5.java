package ch01.ch09;

public class Practice5 {

    public static int solution(int[][] grid) {
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        int cnt = 0;

        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int[] d : directions) {
                    if (grid[i][j] == 1) {
                        int x = i + d[0];
                        int y = j + d[1];

                        if (x < 0 || y < 0 || x>= row || y >= col || grid[x][y] == 0) {
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }

    public static int solution2(int[][] grid) {
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return recursion(grid, directions, i, j);
                }
            }
        }

        return 0;
    }

    public static int recursion(int[][] grid, int[][] directions, int i, int j) {
        int row = grid.length;
        int col = grid[0].length;

        grid[i][j] = -1;
        int cnt = 0;

        for (int[] d : directions) {
            int x = i + d[0];
            int y = j + d[1];
            if (x < 0 || y < 0 || x>= row || y >= col || grid[x][y] == 0) {
                cnt++;
            } else {
                if (grid[x][y] == 1) {
                    cnt += recursion(grid, directions, x, y);
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[][] grid = {{1}};
        System.out.println(solution(grid));
        System.out.println(solution2(grid));

        grid = new int[][] {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(solution(grid));
        System.out.println(solution2(grid));

    }
}
