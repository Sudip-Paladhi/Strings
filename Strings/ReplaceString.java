package com.Strings;

public class ReplaceString {

	public static void main(String[] args) {
		String s= "banana";
		
		while(s.length()>0) {
			char ch= s.charAt(0);
			String s2=s.replace(ch+"", "");
			int count = s.length()-s2.length();
			System.out.println(ch +" = "+ count);
			s=s2;
		}
		
	}

}
