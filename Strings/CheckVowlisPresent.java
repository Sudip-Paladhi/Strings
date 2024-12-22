package com.Strings;

public class CheckVowlisPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sdp";
		if(isVowlPresent(s1))System.out.println("vowel is present");
		else {
			System.out.println("not present");
		}

	}
public static boolean isVowlPresent(String s) {
	s=s.toLowerCase();
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') {
			
			return true;
		}
		
	}
	return false;
	
}
}
