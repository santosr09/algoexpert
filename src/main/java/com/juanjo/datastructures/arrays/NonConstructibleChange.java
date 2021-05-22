package com.juanjo.datastructures.arrays;

import java.util.Arrays;

public class NonConstructibleChange {
	
	/*
	* Given an array of positive integers representing the values of coins in your possession, write a function that returns
	* the minimum amount of change (the minimum sum of money) that you can not create. The given coins can have any positive
	* integer value and aren't necessarily unique (i.e., you can have multiple coins of the same value).
	* */
	
	public int non_ConstructibleChange_(int[] coins) {
		if(coins.length == 0) return 1;
		if(coins.length == 1) {
			return (coins[0] == 1)? 2 : 1 ;
		}
		Arrays.sort(coins);
		int min = coins[0];
		int next = min + 1;
		for(int i = 1; i < coins.length ; i++) {
			if((coins[i] > next) ) {
				return next;
			} else if (coins[i] <= next) {
				next += coins[i];
			}
		}
		return next;
	}
	
	
	// 0(nlogn) time | 0(1) space - n the number of coins
	public int non_ConstructibleChange(int[] coins) {
		Arrays.sort(coins);
		int currentChangeCreated = 0;
		for(int coin : coins){
			if (coin > currentChangeCreated + 1){
				return currentChangeCreated + 1;
			}
			currentChangeCreated += coin;
		}
		return currentChangeCreated + 1;
	}
	
}
