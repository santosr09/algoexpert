package com.juanjo.alghoritms;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoNumberSumTest {
	
	private TwoNumberSum service = new TwoNumberSum();

	@Test
	public void TestCase1() {
		int[] output = service.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
		assertTrue(output.length == 2);
		assertTrue(contains(output, -1));
		assertTrue(contains(output, 11));
	}
	
	public boolean contains(int[] output, int val) {
		for (var el : output) {
			if (el == val) return true;
		}
		return false;
	}

}
