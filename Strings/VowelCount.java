package com.Strings;

public class VowelCount {

	public static void main(String[] args) {
		String a= "sudippaladhi";
		int count=0;
		for (int i = 0; i <a.length(); i++) {
			char c= a.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
