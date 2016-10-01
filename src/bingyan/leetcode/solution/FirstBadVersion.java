package bingyan.leetcode.solution;

public abstract class FirstBadVersion {
	public int firstBadVersion(int n) {
        int r = n;
        int min = 1;
        int max = n;
        while(min <= max) {
        		int mid = (int)((0L + min + max) / 2);
        		if(isBadVersion(mid)) {
        			r = mid;
        			max = mid - 1;
        		}
        		else
        			min = mid + 1;
        }
        return r;
    }
	public abstract boolean isBadVersion(int version);
}
