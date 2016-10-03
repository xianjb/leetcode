package bingyan.leetcode.solution;

public class CountPrimes {
	public int countPrimes(int n) {
		int[] arr = new int[n];
		for(int i=2; i<arr.length; i++) {
			if(arr[i] == 0) {
				for(int in=i+i; in<arr.length; in+=i)
					arr[in] = 1;
			}
		}
		int count = 0;
		for(int i=2; i<arr.length; i++)
			if(arr[i] == 0) count++;
		return count;
	}
}
