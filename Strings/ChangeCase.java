package com.Strings;

public class ChangeCase {

	public static void main(String[] args) {
		String s= "dEvElOpMeNt";
		char [] ch= s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			//char ch[i]= ch[i];
			if (ch[i] >= 'A' && ch[i]<= 'Z') {
				ch[i]= (char)(ch[i]+32);
			}
			else if(ch[i] >= 'a' && ch[i]<= 'z') {
				ch[i]= (char)(ch[i]-32);
			}
		}
		
		System.out.println(ch);

	}

}
