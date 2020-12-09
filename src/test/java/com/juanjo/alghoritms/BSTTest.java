package com.juanjo.alghoritms;

import com.juanjo.datastructures.trees.bst.BST;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BSTTest {
	
	@Test
	public void TestCase1() {
		var root = new BST(10);
		root.left = new BST(5);
		root.left.left = new BST(2);
		root.left.left.left = new BST(1);
		root.left.right = new BST(5);
		root.right = new BST(15);
		root.right.left = new BST(13);
		root.right.left.right = new BST(14);
		root.right.right = new BST(22);
		
		var nullRoot = new BST(0);
		nullRoot.remove(1);
		
		root.insert(12);
		assertTrue(root.right.left.left.value == 12);
		
		System.out.println("Before remove(10): " + root.toString());
		root.remove(10);
		System.out.println("After remove(10): " + root.toString());
		assertTrue(root.contains(10) == false);
		assertTrue(root.value == 12);
		
		assertTrue(root.contains(15));
	}
	
	@Test
	public void TestCase2() {
		BST root = new BST(1);
		
		root.insert(2);
		root.insert(3);
		root.insert(4);
		root.remove(1);
		assertTrue(root.contains(10) == false);
		System.out.println(root);
		
		assertTrue(root.contains(2));
	}
	
	@Test
	public void TestCase3() {
		BST root = new BST(10);
		
		root.insert(5);
		root.insert(15);
		root.insert(2);
		root.insert(5);
		root.insert(13);
		root.insert(22);
		root.insert(1);
		root.insert(14);
		root.insert(12);
		root.remove(5);
		root.remove(5);
		root.remove(12);
		root.remove(13);
		root.remove(14);
		root.remove(22);
		root.remove(2);
		root.remove(1);
		root.contains(15);
		
		assertTrue(root.contains(10));
		System.out.println(root);
		assertTrue(root.contains(15));
	}
}
