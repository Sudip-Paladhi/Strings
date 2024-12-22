package com.Strings;

public class Encription {

	public static void main(String[] args) {
		String s = "developer";
		int l = 20;
		
		char [] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char [] a= s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			int index= a[i]-97;
			index+=l;
			a[i]= alpha[index%26];
		}
		String s2= new String(a);
		System.out.println(s2);
	}
}