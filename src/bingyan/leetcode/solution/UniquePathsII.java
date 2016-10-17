package bingyan.leetcode.solution;

public class UniquePathsII {
	public int uniquePathsWithObstacles(int[][] grid) {
		if(grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0)
			return 0;
		
		int height = grid.length - 1;
		int weidth = grid[0].length - 1;
		int[][] arr = new int[height][weidth];
		
		arr[height][weidth] = grid[height][weidth] == 1 ? 0 : 1;
		for(int i=height-1; i>=0; i--)
			arr[i][weidth] = grid[i][weidth] == 1 || arr[i + 1][weidth] == 0 ? 0 : 1;
		for(int i=weidth-1; i>=0; i--)
			arr[height][i] = grid[height][i] == 1 || arr[height][i + 1] == 0 ? 0 : 1;
		for(int x=height-1; x>=0; x--)
			for(int y=weidth-1; y>=0; y--)
				arr[x][y] = grid[x][y] == 1 ? 0 : arr[x+1][y] + arr[x][y+1];
		return arr[0][0];
	}
}
