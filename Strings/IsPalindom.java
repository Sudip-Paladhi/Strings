package com.Strings;

public class IsPalindom {

	public static void main(String[] args) {
		System.out.println(isPalindom1("Malayalam"));

	}
	
	static boolean isPalindom1(String s ) {
		s= s.toLowerCase();
		int i=0;
		int j= s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;

	}

}
