package com.Strings;

public class RemoveDuplicateCar {

	public static void main(String[] args) {
		String s= "BAnana".toLowerCase();
		char [] ch= s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i] == ch[j]) {
					ch[j]='\u0000';
				}
			}
		}
          System.out.println(ch);
	}

}
