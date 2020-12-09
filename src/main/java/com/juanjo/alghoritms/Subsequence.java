package com.juanjo.alghoritms;

import java.util.List;

public class Subsequence {
	
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		if (sequence.size() > array.size()) return false;
		int nextIndex=0;
		boolean match = false;
		for(int index = 0; index < sequence.size(); index++) {
			int currentNumber = sequence.get(index);
			match = false;
			for(int i = nextIndex; i < array.size(); i++) {
				int nextNumber = array.get(i);
				if(currentNumber == nextNumber) {
					match = true;
					nextIndex = i + 1;
					break;
				}
			}
			if(!match) break;
		}
		return match;
	}
	
	public static boolean isValidSubsequenceAlt(List<Integer> array, List<Integer> sequence) {
		
		return array.containsAll(sequence);
	}
	
}
