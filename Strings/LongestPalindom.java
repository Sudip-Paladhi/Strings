package com.prac;

public class LongestPalindom {

	public static void main(String[] args) {
		String s = "malayalam";
		String longest = "";

		for (int i = 0; i < s.length()-1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (isPalindom(s, i, j)) {
					String current = s.substring(i, j + 1);
					if (current.length() > longest.length())
						longest = current;
				}
			}
		}
		System.out.println("longest palindom is: " + longest);
	}

	static boolean isPalindom(String s, int start, int end) {
		int i = start;
		int j = end;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}