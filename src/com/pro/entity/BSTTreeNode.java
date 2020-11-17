package com.pro.entity;

/**
 * @describe Binary search tree node
 * @author Wei Wu
 */
public class BSTTreeNode<T> {
	
	public BSTTreeNode() {
		
	}
	
	public BSTTreeNode(T info,BSTTreeNode<T> left,BSTTreeNode<T> right) {
		this.info = info;
		this.left = left;
		this.right = right;
	}

	private T info;
	
	private BSTTreeNode<T> left;
	
	private BSTTreeNode<T> right;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public BSTTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BSTTreeNode<T> left) {
		this.left = left;
	}

	public BSTTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BSTTreeNode<T> right) {
		this.right = right;
	}
	
}
