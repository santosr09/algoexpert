package com.juanjo.arrays;

import com.juanjo.datastructures.arrays.TournamentWinner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TournamentWinnerTest {
	
	TournamentWinner classTest;
	ArrayList<ArrayList<String>> competitions;
	ArrayList<Integer> results;
	
	@BeforeAll
	private void setUp() {
		results = new ArrayList<Integer>();
		classTest = new TournamentWinner();
		competitions = new ArrayList<ArrayList<String>>();
		String[][] arrComp =
		{
				{"HTML", "C#"},
				{"C#", "PYTHON"},
				{"PYTHON", "HTML"}
		};
		Integer[] arrRes = {
			0, 0, 1
		};
		for(String[] item: Arrays.asList(arrComp)){
			ArrayList temp = new ArrayList();
			temp.addAll(Arrays.asList(item));
			competitions.add(temp);
		}
		results.addAll(Arrays.asList(arrRes));
	}
	
	@Test
	public void getWinnerTest() {
		String result = classTest.getWinner(competitions, results);
		System.out.println(result);
	}
	
}
