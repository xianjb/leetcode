package bingyan.leetcode.solution;

public class GuessNumberHigherOrLower {
	public int guessNumber(int n) {
        int min = 1;
        int max = n;
        while(min < max) {
            int mid = (int)((min + 0L + max) / 2);
            int r = guess(mid);
            if(r == 0)
                return mid;
            else if(r > 0)
                min = mid + 1;
            else
                max = mid - 1;
        }
        return min;
    }
	private static int guess(int mid) {
		return 0;
	}
}
