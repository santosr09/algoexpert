package com.juanjo.strings;

public class PalindromeCheck {
	
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return str.equals(sb.toString());
	}
	
	
}
