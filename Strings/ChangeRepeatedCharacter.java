package com.prac;

public class ChangeRepeatedCharacter {
	public static void main(String[] args) {
		String s = "sudippaladhi";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			if (ch[i] == '$')
				continue;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '$';
				}
			}
			if (count > 1) {
				ch[i] = '$';
			}
		}
		System.out.println(ch);
	}
}