package com.prac;

public class LongestWordInGivenString {

	public static void main(String[] args) {
		String s = "find longest string in a given array";
		String[] s2 = s.split(" ");
		String longest = "";
		
//      int i = 0;
//		while (i < s2.length) {
//			if (s2[i].length() > longest.length()) {
//				longest = s2[i];
//			}
//			i++;
//		}
		
		for (String string : s2) {
			if(string.length() > longest.length()) {
				longest=string;
			}
		}

		System.out.println("Longest word is: " + longest);
	}
}