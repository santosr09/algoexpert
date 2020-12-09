package com.juanjo.alghoritms;

public class TwoNumberSum {
	
	public static int[] twoNumberSum(int[] array, int targetSum) {
		for(int index = 0; index < array.length; index++) {
			for(int nextIndex = index+1; nextIndex < array.length; nextIndex++){
				int currentItem = array[index];
				int nextItem = array[nextIndex];
				if (currentItem + nextItem == targetSum){
					return new int[] {currentItem, nextItem};
				}
			}
		}
		return new int[0];
	}
	
}
