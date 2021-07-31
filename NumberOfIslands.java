package recursion;

public class NumberOfIslands {

	private static int[][] possibleMoves = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };

	public static void main(String[] args) {
		char[][] grid = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };

		System.out.println(numIslands(grid));
	}

	public static int numIslands(char[][] grid) {
		int[] nextIsland = findUndiscoveredLand(grid);
		char flag = '2';
		int islandCount = 0;
		while (nextIsland != null) {
			islandCount++;
			coverAllNewLand(grid, nextIsland);
			nextIsland = findUndiscoveredLand(grid);
		}
		return islandCount;
	}

	public static void coverAllNewLand(char[][] grid, int[] pos) {
		grid[pos[0]][pos[1]] = '2';

		for (int i = 0; i < 4; i++) {
			int y = pos[0] + possibleMoves[0][i];
			int x = pos[1] + possibleMoves[1][i];
			if (y >= 0 && y < grid.length) {
				if (x >= 0 && x < grid[0].length) {
					if (grid[y][x] == '1') {
						int[] newPos = { y, x };
						coverAllNewLand(grid, newPos);
					}
				}
			}
		}
	}

	public static int[] findUndiscoveredLand(char[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j] == '1') {
					int[] newIsland = { i, j };
					return newIsland;
				}
			}
		}

		return null;
	}

	public static void printMaze(char[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			System.out.println("");
			for (int j = 0; j < maze[0].length; j++) {
				System.out.print(maze[i][j] + " ");
			}
		}
		System.out.println(" ");
	}

}
