package com.Strings;

public class SumOfNumber {

	public static void main(String[] args) {
		String s = "ram@123";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			char ch= s.charAt(i);
			if (ch >= '0' && ch<='9') {
				int n= Integer.parseInt(ch +"");
				sum+= n;
			}
		}
         System.out.println(sum);
	}

}