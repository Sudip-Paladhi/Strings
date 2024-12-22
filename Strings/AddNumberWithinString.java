package com.Strings;

public class AddNumberWithinString {

	public static void main(String[] args) {
		String s = "java143 is2 3 oop long3";
		char [] ch= s.toCharArray();
		int rev=0;
		int sum=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] > '0' && ch[i]<='9') {
				rev= (rev*10) + ch[i]-'0';
			}
			else {
				sum+=rev;
				rev=0;
			}
			if(i== ch.length-1) {
				sum+=rev;
			}
		}
		System.out.println(sum);
	}
}