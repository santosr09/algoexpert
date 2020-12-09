package com.juanjo.alghoritms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubsequenceTest {
	
	@Test
	public void TestCase1() {
		var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
		var sequence = Arrays.asList(1, 6, -1, 10);
		assertEquals(true, Subsequence.isValidSubsequence(array, sequence));
	}
	
	@Test
	public void TestCase2() {
		var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
		var sequence = Arrays.asList(4, 5, 1, 22, 25, 6, -1, 8, 10);
		assertEquals(false, Subsequence.isValidSubsequence(array, sequence));
	}
	
	@Test
	public void TestCase3() {
		var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
		var sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10, 12);
		assertEquals(false, Subsequence.isValidSubsequence(array, sequence));
	}
	
	@Test
	public void TestCase4() {
		var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
		var sequence = Arrays.asList(1, 6, -1, -1);
		assertEquals(false, Subsequence.isValidSubsequence(array, sequence));
	}
	
}
