package com.Strings;

public class RevurseStringArray {

	public static void main(String[] args) {
		String s= "java is very easy";
		String [] s2= s.split(" ");
		int len= s2.length;
		String a = s2[len-1];
		for (int i = s2.length-2; i >=0; i--) {
			a= a + " "+ s2[i];
		}
		System.out.println(a);

	}

}
