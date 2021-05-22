package com.juanjo.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PalindromeCheckTest {
	
	@Test
	public void checkPalindromeMethod_1() {
		String str = "abcdcba";
		Assertions.assertEquals(true, PalindromeCheck.isPalindrome(str));
	}
	
	@Test
	public void checkPalindromeMethod_2() {
		String str = "abcccba";
		Assertions.assertEquals(true, PalindromeCheck.isPalindrome(str));
	}
	
	@Test
	public void checkPalindromeMethod_3() {
		String str = "abcccdba";
		Assertions.assertEquals(false, PalindromeCheck.isPalindrome(str));
	}
	
}
