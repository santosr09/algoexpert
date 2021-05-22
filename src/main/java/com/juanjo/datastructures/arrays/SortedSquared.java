package com.juanjo.datastructures.arrays;

import java.util.Arrays;
import java.util.Iterator;

import static java.lang.Math.abs;

public class SortedSquared {
	
	/*
	* To reduce the time complexity of the algorithm avoid sorting the output array. As you square the values fo the input array
	* try to directly insert them into their correct position in the output array
	*
	* Use two pointers to keep track of the smallest and largest values in the input array. Compare the absolute values of
	* these smallest and largest values, square the larger absolute value, and place the square at the end of the output array,
	* filling it up from right to left. Move the pointers accordingly, and repeat this process until the output array is filled.
	*
	* */
	
	public int[] sortedSquaredArray(int[] inputArray) {
		int[] resultArr = new int[inputArray.length];
		int resutlIndex = resultArr.length - 1, ending = inputArray.length - 1, begining = 0;
		for ( ; begining <= inputArray.length ; ) {
			int smallest = inputArray[begining];
			if (resutlIndex == 0) {
				resultArr[0] = smallest *= smallest;
				break;
			}
			int largest = inputArray[ending];
			if(abs(smallest) < abs(largest)) {
				largest *= largest;
				resultArr[resutlIndex] = largest;
				--ending;
			} else {
				smallest *= smallest;
				resultArr[resutlIndex] = smallest;
				++begining;
			}
			resutlIndex--;
		}
		return resultArr;
	}
	
/*	public int[] sortedSquaredArray(int[] array) {
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
	}*/
	
}
