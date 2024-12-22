package com.Strings;

public class InitCap {

	public static void main(String[] args) {
		String s = "hello everyone how are you";
		char [] ch= s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i == 0 || ch[i-1] == ' ') {
				if(ch[i] >= 'a' && ch[i]<= 'z') {
				ch[i] =(char) (ch[i]-32);
				}
			}
		}
         System.out.println(ch);
	}
}