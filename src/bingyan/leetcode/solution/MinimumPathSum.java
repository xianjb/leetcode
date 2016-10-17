package bingyan.leetcode.solution;

public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
		if(grid == null || grid.length == 0)
			return 0;
		int height = grid.length - 1;
		int weidth = grid[0].length - 1;
		
		for(int i=height-1; i>=0; i--)
			grid[i][weidth] += grid[i + 1][weidth];
		for(int i=weidth-1; i>=0; i--)
			grid[height][i] += grid[height][i + 1];
		
		for(int x=height-1; x>=0; x--)
			for(int y=weidth-1; y>=0; y--)
				grid[x][y] += Math.min(grid[x + 1][y], grid[x][y + 1]);
		
		return grid[0][0];
	}
}
