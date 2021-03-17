package com.juanjo.datastructures.arrays;

import java.util.*;
import java.util.function.BiFunction;

public class TournamentWinner {
	public String getWinner(
			ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		// Write your code here.
		Map<String, Integer> rankingTable = new HashMap<String, Integer>();
		int i = 0;
		for(Integer winner: results) {
			int index = (winner == 0) ? 1 : 0;
			String winnerName = (competitions.get(i)).get(index);
			int val = (rankingTable.get(winnerName) != null) ? rankingTable.get(winnerName)+1 : 1;
			rankingTable.put(winnerName, ++val);
			i++;
		}
		String winner = Collections.max(rankingTable.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
		return winner;
	}
	
/*	BiFunction<ArrayList<ArrayList<String>>, ArrayList<Integer>, Map> biFun = (competitions, results) -> {
		competitions.stream()
				.flatMap(List::get)
				.map()
		return null;
	};*/
	
	public String getWinnerNew(
			ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		// Write your code here.
		Map<String, Integer> rankingTable = new HashMap<String, Integer>();
		
		String winner = Collections.max(rankingTable.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
		return winner;
	}
}
