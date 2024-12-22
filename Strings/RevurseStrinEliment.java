package com.Strings;

public class RevurseStrinEliment {

	public static void main(String[] args) {
		String s= "Java is very Easy";
		char [] s2= s.toCharArray();
		int i=0;
		int j=0;
		while(i <s2.length) {
			while(j <s2.length && s2[j] !=' ') j++;
			int start =i;
			int end =j-1;
			while(start<end) {
				char temp= s2[start];
				s2[start]=s2[end];
				s2[end]= temp;
				start++;
				end--;
			}
			j++;
			i=j;
		}
		String a= new String(s2);
		System.out.println(a);
	}
}