package com.juanjo.arrays;

import com.juanjo.datastructures.arrays.SortedSquared;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SortedSquaredTest {
	
	private SortedSquared obj;
	int[] arrIn;
	
	@BeforeAll
	public void setUp() {
		obj = new SortedSquared();
		//arrIn = new int[] {1, 2, 3, 5, 6, 8, 9};
		arrIn = new int[] {-4, -3, -2, 1, 2, 3, 7};
	}
	
	@Test
	public void sortedArrayTest(){
		for(int item: obj.sortedSquaredArray(arrIn)){
			System.out.println(item);
		}
	}
}
