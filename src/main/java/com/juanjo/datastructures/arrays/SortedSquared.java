package com.juanjo.datastructures.arrays;

public class SortedSquared {
	
	public int[] sortedSquaredArray(int[] array) {
		int[] results = new int[array.length];
		int index = 0, negCounter = 0;
		int indexNeg = array.length;
		for(int item : array) {
			if(item < 0)
				negCounter++;
			break;
		}
		
		int[] negNum = new int[negCounter];
		int[] posNum = new int[array.length - negCounter];
		
		for(int item: array) {
			if(item < 0)
				negNum[index] = (array[index] * array[index]);
			posNum[index] = (array[index] * array[index]);
			index++;
		}
		
		for (int i = 0; i < array.length; i++) {
			if(i < negNum.length && negNum[i] < posNum[i])
				results[i] = negNum[i];
			
		}
		
		return results;
	}
	
}
