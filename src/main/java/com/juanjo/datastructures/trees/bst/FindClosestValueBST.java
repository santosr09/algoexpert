package com.juanjo.datastructures.trees.bst;

public class FindClosestValueBST {
	static int closestInt = 0;
	static int minDif = Integer.MAX_VALUE;
	
	public static int findClosestValueInBst(BST tree, int target) {
		BST currentNode = tree;
		int difUp, difDown, currentMinDif = 0;
		if(target < currentNode.value){
			difUp = currentNode.value - target;
			if(currentNode.left != null) {
				difDown = target - currentNode.left.value;
				currentMinDif =  (difUp > difDown) ? Math.abs(difDown) : Math.abs(difUp);
				if(currentMinDif < minDif) {
					minDif = currentMinDif;
					closestInt = (difDown > difUp) ? currentNode.value : currentNode.left.value;
				}
				findClosestValueInBst(currentNode.left, target);
			}
			else {
				return closestInt;
			}
			
		}
		else {
			difUp = target - currentNode.value;
			if(currentNode.right != null) {
				difDown = currentNode.right.value - target;
				currentMinDif =  (difUp > difDown) ? Math.abs(difDown) : Math.abs(difUp);
				if(currentMinDif < minDif) {
					minDif = currentMinDif;
					closestInt = (difDown > difUp) ? currentNode.value : currentNode.right.value;
				}
				findClosestValueInBst(currentNode.right, target);
			}
			else {
				return closestInt;
			}
			
		}
		
		// Write your code here.
		minDif = Integer.MAX_VALUE;
		return closestInt;
	}
	
	public static class BST {
		public int value;
		public BST left;
		public BST right;
		
		public BST(int value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return "BST{" +
								 "value=" + value +
								 ", left=" + left +
								 ", right=" + right +
								 '}';
		}
	}
}
