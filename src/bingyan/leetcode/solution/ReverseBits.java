package bingyan.leetcode.solution;

public class ReverseBits {
	public int reverseBits(int n) {
        int v = 0;
        for(int i=0; i<32; i++) {
            v <<= 1;
            v += (n & 1);
            n >>>= 1;
        }
        return v;
    }
}
