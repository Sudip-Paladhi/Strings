package com.Strings;

public class HighSubstringPalindom {

	public static void main(String[] args) {
		String s= "Malayalam";
		String bigPalindome="";
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(isPalindome(s, i, j)) {
					String s1= s.substring(i, j+1);
					System.out.println(s1);
					if(s1.length() > bigPalindome.length()) {
						bigPalindome= s1;
					}
				}
			}
		}
		System.out.println("bigPalindome is = " + bigPalindome);

	}
	
	
	public static boolean isPalindome(String s, int start, int end) {
		s=s.toLowerCase();
		int i= start;
		int j= end;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	
	

}
