package com.prac;

public class ConvertFirstAndLastWord_IN_Uppercase {

	public static void main(String[] args) {
		String s = "convert first and last character in uppercase";
		String[] arr = s.split(" ");
		String s2 = "";

		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == arr.length - 1) {
				s2 += arr[i].toUpperCase() + " ";
			} else {
				s2 += arr[i] + " ";
			}
		}
		System.out.println(s2);
	}
}