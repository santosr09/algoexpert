package com.juanjo.arrays;

import com.juanjo.datastructures.arrays.NonConstructibleChange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NonConstructibleChangeTest {

	private NonConstructibleChange testClass;
	
	@BeforeAll
	private void setUp() {
		testClass = new NonConstructibleChange();
	}
	
	@Test
	public void testNonConstructibleMethod_1() {
		int[] inputArr = new int[]{5,7,1,1,2,3,22};
		int result = testClass.non_ConstructibleChange(inputArr);
		Assertions.assertEquals(20, result);
	}
	
	@Test
	public void testNonConstructibleMethod_2() {
		int[] inputArr = new int[]{1,2,4};
		int result = testClass.non_ConstructibleChange(inputArr);
		Assertions.assertEquals(8, result);
	}
	
	@Test
	public void testNonConstructibleMethod_3() {
		int[] inputArr = new int[]{4};
		int result = testClass.non_ConstructibleChange(inputArr);
		Assertions.assertEquals(1, result);
	}
	
	@Test
	public void testNonConstructibleMethod_4() {
		int[] inputArr = new int[]{};
		int result = testClass.non_ConstructibleChange(inputArr);
		Assertions.assertEquals(1, result);
	}
	
	@Test
	public void testNonConstructibleMethod_5() {
		int[] inputArr = new int[]{1,2,4,7};
		int result = testClass.non_ConstructibleChange(inputArr);
		Assertions.assertEquals(15, result);
	}
	
	@Test
	public void testNonConstructibleMethod_6() {
		int[] inputArr = new int[]{1};
		int result = testClass.non_ConstructibleChange(inputArr);
		Assertions.assertEquals(2, result);
	}
	
}
