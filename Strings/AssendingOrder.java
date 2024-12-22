package com.Strings;

public class AssendingOrder {

	public static void main(String[] args) {
		String s= "banana";
		char [] ch= s.toCharArray();
		for (int i = 1; i < ch.length; i++) {
			char c=ch[i]; 
			int j= i-1;
			while(j>=0 && ch[j]>c) {
				ch[j+1]=ch[j];
				j--;
			}
			ch[j+1]= c;
		}
		String s1= new String(ch);
		System.out.println(s1);

	}

}
