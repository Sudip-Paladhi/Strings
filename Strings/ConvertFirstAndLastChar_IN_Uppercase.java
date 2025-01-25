package com.prac;

public class ConvertFirstAndLastChar_IN_Uppercase {

	public static void main(String[] args) {

		String s = "sudippaladhi";

//      without using inbuilt method
//		char[] ch = s.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if (i == 0 || i == ch.length - 1) {
//				ch[i] = (char) (ch[i] - 32);
//			}
//		}
//		System.out.println(ch);

//		Using inbuilt method.
		String result = (s.substring(0, 1).toUpperCase()) + (s.substring(1, s.length() - 1))
				+ (s.substring(s.length() - 1).toUpperCase());
		System.out.println(result);
	}
}