package com.Strings;

public class CountChar {

	public static void main(String[] args) {
		String s= "abcdABCD!@#$1234";
		String uc="";
		String lc="";
		String nc="";
		String sp="";
		for (int i = 0; i < s.length(); i++) {
			char ch= s.charAt(i);
			if(ch >= 'A' && ch<='Z') {
				uc += ch;
			} else if (ch >= 'a' && ch<='z') {
				lc += ch;
			} else if (ch >= '0' && ch<='9') {
				nc += ch;
			}
			else {
				sp += ch;
			}
		}
		
		s = sp+nc+lc+uc;
		System.out.println(s);

	}

}
