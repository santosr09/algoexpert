package com.juanjo.alghoritms;

import com.juanjo.datastructures.trees.bst.FindClosestValueBST;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindClosestValueBSTTest {
	
	@Test
	public void TestCase1() {
		var root = new FindClosestValueBST.BST(10);
		root.left = new FindClosestValueBST.BST(5);
		root.left.left = new FindClosestValueBST.BST(2);
		root.left.left.left = new FindClosestValueBST.BST(1);
		root.left.right = new FindClosestValueBST.BST(5);
		root.right = new FindClosestValueBST.BST(15);
		root.right.left = new FindClosestValueBST.BST(13);
		root.right.left.right = new FindClosestValueBST.BST(14);
		root.right.right = new FindClosestValueBST.BST(22);
		
		var expected = 13;
		var actual = FindClosestValueBST.findClosestValueInBst(root, 12);
		assertEquals(expected, actual);
		
		System.out.println(root);
		
		var expectedB = 5;
		var actualB = FindClosestValueBST.findClosestValueInBst(root, 7);
		assertEquals(expectedB, actualB);
		
		
		var expectedC = 10;
		var actualC = FindClosestValueBST.findClosestValueInBst(root, 11);
		assertEquals(expectedC, actualC);
		
		var expectedD = 10;
		var actualD = FindClosestValueBST.findClosestValueInBst(root, 9);
		assertEquals(expectedC, actualC);
	}
}
