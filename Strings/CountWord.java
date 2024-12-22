package com.Strings;

public class CountWord {

	public static void main(String[] args) {
		String s= "cat bat mat rat cat bat rat mat mat";
		String [] s2= s.split(" ");
		for (int i = 0; i < s2.length; i++) {
			int count=1;
			if(s2[i] == " ") continue;
			for (int j = i+1; j < s2.length; j++) {
				if(s2[i].equals(s2[j])) {
					count++;
					s2[j]=" ";
				}
			}
			System.out.println(s2[i] + " = "+ count);
		}
		
	}

}