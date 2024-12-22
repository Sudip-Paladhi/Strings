package com.Strings;

public class CaseCounting {

	public static void main(String[] args) {
		String s= "ABC@#&&abc123";
		int uc=0, lc=0, ltr=0, ss=0;
		for (int i = 0; i < s.length(); i++) {
			char c= s.charAt(i);
			if (c >='0' && c<='9') {
				ltr++;
			} else if (c >='A' && c<='Z') {
				uc++;
			} else if (c >='a' && c<='z') {
				lc++;
			} else {
				ss++;
			}
		}
		System.out.println("letter = "+ ltr);
		System.out.println("Uppercas = "+ uc);
		System.out.println("Lowercas = "+ lc);
		System.out.println("special Character = "+ ss);
	}
}