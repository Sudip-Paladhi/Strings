package com.Strings;

public class ReverseStrings {

	public static void main(String[] args) {
		String s= "abcdefgh123@#$";
		String rev= "";
		for (int i = s.length()-1; i>=0; i--) {
			rev += s.charAt(i); 
		}
		System.out.println(rev);

	}

}
