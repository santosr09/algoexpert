package com.juanjo.datastructures.trees.bst;

public class BST {
	
	public int value;
	public BST left;
	public BST right;
	
	public BST(int value) {
		this.value = value;
	}
	
	public BST insert(int valueInserting) {
		return insert(valueInserting, this);
	}
	
	public BST insert(int valueInserting, BST currentNode) {
		while(true){
			if(valueInserting < currentNode.value) {
				if(currentNode.left == null) {
					currentNode.left = new BST(valueInserting);
					break;
				}
				else {
					currentNode = currentNode.left;
				}
			}
			else {
				if(currentNode.right == null) {
					currentNode.right = new BST(valueInserting);
					break;
				}
				else {
					currentNode = currentNode.right;
				}
			}
		}
		return this;
	}
	
	public boolean contains(int lookedValue) {
		BST currentNode = this;
		while(currentNode != null) {
			if(lookedValue == currentNode.value) {
				return true;
			}
			else if(lookedValue < currentNode.value) {
				currentNode = currentNode.left;
				continue;
			}
			else {
				currentNode = currentNode.right;
				continue;
			}
		}
		return false;
	}
	
	public BST remove(int value) {
		BST temp = remove(value, this);
		if(temp != null){
			this.value = temp.value;
			this.left = temp.left;
			this.right = temp.right;
		}
		return this;
	}
	
	public BST remove(int removeValue, BST currentNode) {
		if(currentNode == null) return null;
		if(removeValue < currentNode.value){
			currentNode.left = remove(removeValue, currentNode.left);
		}
		else if(removeValue > currentNode.value) {
			currentNode.right = remove(removeValue, currentNode.right);
		}
		else {
			if(currentNode.left == null) {
				return currentNode.right;
			}
			else if(currentNode.right == null) {
				return currentNode.left;
			}
			currentNode.value = minValue(currentNode.right);
			currentNode.right = remove(currentNode.value, currentNode.right);
		}
		return currentNode;
	}
	
	private int minValue(BST nodo) {
		int minValue = nodo.value;
		while(nodo.left != null) {
			minValue = nodo.left.value;
			nodo = nodo.left;
		}
		return minValue;
	}
	
	@Override
	public String toString() {
		return "BST{" +
							 "value=" + value +
							 ", left=" + left +
							 ", right=" + right +
							 '}';
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
}
