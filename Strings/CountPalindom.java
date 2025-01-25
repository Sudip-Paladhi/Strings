package com.prac;

public class CountPalindom {

	public static void main(String[] args) {
		String s = "malayalam";
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (isPalindom(s, i, j)) {
					count++;
				}
			}
		}
		System.out.println("Total " + count + " palindom present in this String.");

	}

	static boolean isPalindom(String s, int start, int end) {
		int i = start;
		int j = end;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}