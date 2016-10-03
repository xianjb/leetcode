package bingyan.leetcode.solution;

public class CountingBits {
	public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        if(arr.length >= 2) arr[1] = 1;
        int pre = 1;
        int limit = 2;
        for(int i=2; i<arr.length; i++) {
            if(i == limit) {
                arr[i] = 1;
                pre = limit;
                limit <<= 1;
            }
            else {
                arr[i] = 1 + arr[i - pre];
            }
        }
        return arr;
    }
}
