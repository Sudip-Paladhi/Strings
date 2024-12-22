package com.Strings;

public class OccaranceCount {

	public static void main(String[] args) {
		String s= "sudippaladhi";
		char [] ch= s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count=1;
			for (int j = i+1; j < s.length(); j++) {
				if(ch[i] == ch[j]) {
					ch[j]='\u0000';
					count++;
				}
			}
			
			if(ch[i] != '\u0000')
				System.out.println(ch[i]+ " = " + count);
		}
	}
}
