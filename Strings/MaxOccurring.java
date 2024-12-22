package com.Strings;

public class MaxOccurring {

	public static void main(String[] args) {
		String s= "banana";
		char maxChar='\0';
		int maxOccur=0;
		char [] ch= s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='\u0000') continue;
			int count=1;
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
			}
			if(count<maxOccur) {
				maxChar=ch[i];
				maxOccur=count;
			}
		}System.out.println("Maximum Occurring is: "+ maxChar + " occurence is : "+ maxOccur);
	}
}
