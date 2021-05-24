package com.juanjo.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RunLengthEncodingTest {
	
	private RunLengthEncoding testClass;
	
	@BeforeAll
	private void setUp() {
		testClass = new RunLengthEncoding();
	}
	
	public void firsteMethodTest_1() {
		String input = "";
		testClass.runLengthEncoding(input);
		Assertions.assertEquals("", "");
	}
	
@Test
	public void firsteMethodTest_2() {
		String input = "AAAAAAAAAAAABBCCCCDD";
		Assertions.assertEquals("9A3A2B4C2D", testClass.runLengthEncoding(input));
	}
	
	@Test
	public void firsteMethodTest_3() {
		String input = "aA";
		Assertions.assertEquals("1a1A", testClass.runLengthEncoding(input));
	}
	
}
