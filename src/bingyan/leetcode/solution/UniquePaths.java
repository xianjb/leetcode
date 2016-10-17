package bingyan.leetcode.solution;

public class UniquePaths {
	public int uniquePaths(int m, int n) {
		if(m <= 0 || n <= 0)
			return 0;
		
		int[][] arr = new int[m][n];
		for(int i=0; i<n; i++)
			arr[m-1][i] = 1;
		for(int i=0; i<m; i++)
			arr[i][n-1] = 1;
		
		for(int x=m-2; x>=0; x--)
			for(int y=n-2; y>=0; y--)
				arr[x][y] = arr[x + 1][y] + arr[x][y + 1];
		return arr[0][0];
	}
}
