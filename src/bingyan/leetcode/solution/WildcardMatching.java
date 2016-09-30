package bingyan.leetcode.solution;

public class WildcardMatching {
	public boolean isMatch(String s, String p) {
		boolean[][] arr = new boolean[p.length() + 1][s.length() + 1];
		arr[0][0] = true;
		for (int i = 0; i < p.length(); i++) {
			int index = 0;
			while (index < arr[0].length && arr[i][index] == false)
				index++;
			if (p.charAt(i) == '*') {
				while (index < arr[0].length)
					arr[i + 1][index++] = true;
			} else {
				for (; index < s.length(); index++) {
					if (arr[i][index])
						if (p.charAt(i) == '?' || p.charAt(i) == s.charAt(index))
							arr[i + 1][index + 1] = true;
				}
			}
		}
		return arr[p.length()][s.length()];
	}
}
