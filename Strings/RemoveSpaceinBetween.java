package com.Strings;

public class RemoveSpaceinBetween {
	
	public static void main(String[] arg) {
		String s="java is easy";
		char[] a=new char[s.length()];
		int k=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')continue;
			a[k++]=s.charAt(i);
			
		}
		String s1=new String(a);
	System.out.print(s1);
		
	}

}
