package com.pro.imple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import com.pro.entity.BSTTreeNode;
import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.BSTInterface;

/**
 * @describe Binary search tree
 * @author Wei Wu
 */
public class BinarySearchTree<T> implements BSTInterface<T> {

	private BSTTreeNode<T> root;//root node of the tree
	private Comparator<T> comp;//comparator
	private boolean found;//matched->true, unmatched->false
	private int stepNum;//Step execution times of search algorithm
	
	//constructor
	public BinarySearchTree() {
		this.root = null;
		comp = new Comparator<T>() {
			public int compare(T element,T element2) {
				return ((Comparable)element).compareTo(element2);
			}
		};
	}
	
	public BinarySearchTree(Comparator<T> comp) {
		this.root = null;
		this.comp = comp;
	}
	
	@Override
	public boolean add(T element) throws OverflowException {
		//Cell the recAdd method.
		this.root = this.recAdd(element, this.root);
		//Return true.
		return true;
	}
	
	/**
	 * Add node into this tree
	 * @param element
	 * @param node
	 * @return The number of this tree
	 */
	private BSTTreeNode<T> recAdd(T element,BSTTreeNode<T> node) {
		if(node == null) {
			node = new BSTTreeNode<T>(element,null,null);
		}else if(this.comp.compare(element, node.getInfo()) < 0) {
			node.setLeft(this.recAdd(element, node.getLeft()));
		}else if(this.comp.compare(element, node.getInfo()) > 0) {
			node.setRight(this.recAdd(element, node.getRight()));
		}
		return node;
	}

	@Override
	public T search(T target) {
		//Cell the get method.
		this.stepNum = 0;
		return this.get(target, this.root);
	}
	
	/**
	 * Find the target
	 * @param target
	 * @param node
	 * @return true is found and false is not found
	 */
	private T get(T target,BSTTreeNode<T> node) {
		//Number of additional steps
		this.stepNum++;
		if(node == null) {
			return null;
		}else if(this.comp.compare(target, node.getInfo()) < 0) {
			return this.get(target, node.getLeft());
		}else if(this.comp.compare(target, node.getInfo()) > 0) {
			return this.get(target, node.getRight());
		}else {
			return node.getInfo();
		}
	}

	@Override
	public boolean contain(T target) {
		//Cell the recContoins method.
		return this.recContoins(target, this.root);
	}
	
	/**
	 * Find the target
	 * @param target
	 * @param node
	 * @return true is found and false is not found
	 */
	private boolean recContoins(T target,BSTTreeNode<T> node) {
		if(node == null) {
			return false;
		}else if(this.comp.compare(target, node.getInfo()) < 0) {
			return this.recContoins(target, node.getLeft());
		}else if(this.comp.compare(target, node.getInfo()) > 0) {
			return this.recContoins(target, node.getRight());
		}else {
			return true;
		}
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		if(this.isEmpty()) {
			throw new UnderflowException("The tree is empty!");
		}
		//Cell the recRemove method.
		BSTTreeNode<T> root = this.recRemove(target, this.root);
		//Result the found
		return this.found;
	}
	
	/**
	 * Find the target
	 * @param target
	 * @param node
	 * @return true is found and false is not found
	 */
	private BSTTreeNode<T> recRemove(T target,BSTTreeNode<T> node) {
		if(node == null) {
			this.found = false;
		}else if(this.comp.compare(target, node.getInfo()) < 0) {
			node.setLeft(this.recRemove(target, node.getLeft()));
		}else if(this.comp.compare(target, node.getInfo()) > 0) {
			node.setRight(this.recRemove(target, node.getRight()));
		}else {
			node = this.removeNode(node);
			this.found = true;
		}
		return node;
	}
	
	/**
	 * Remove give node
	 * @param node
	 * @return true is success,false is fail.
	 */
	private BSTTreeNode<T> removeNode(BSTTreeNode<T> node) {
		T data;
		if(node.getLeft() == null) {
			//Return the right
			return node.getRight();
		}else if(node.getRight() == null) {
			//Return the left
			return node.getLeft();
		}else {
			//When the node has left node and right node.
			data = this.getPredecessor(node.getLeft());
			node.setInfo(data);
			node.setLeft(this.recRemove(data, node.getLeft()));
			//Return node
			return node;
		}
	}
	
	/**
	 * Found far right node of param node,return the node's info.
	 * @param node
	 * @return found node's info
	 */
	private T getPredecessor(BSTTreeNode<T> node) {
		BSTTreeNode<T> currentNode = node;
		while(currentNode.getRight() != null) {
			currentNode = currentNode.getRight();
		}
		return currentNode.getInfo();
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return (this.root == null);
	}

	@Override
	public int size() {
		return this.recSize(this.root);
	}
	
	/**
	 * Count number of node in this tree
	 * @param node
	 * @return The number of this tree
	 */
	private int recSize(BSTTreeNode<T> node) {
		if(node == null) {
			return 0;
		}else {
			return 1 + this.recSize(node.getLeft()) + this.recSize(node.getRight());
		}
	}

	@Override
	public Iterator<T> iterator() {
		//Call getIterator method by inorder
		return getIterator(BSTInterface.Traversal.Inorder);
	}

	@Override
	public T min() {
		if(this.isEmpty()) {
			//If this tree is empty,return null.
			return null;
		}
		//Get the root to node variable.
		BSTTreeNode<T> node = this.root;
		//Loop to find left node is null
		while(node.getLeft() != null) {
			node = node.getLeft();
		}
		//Return the info of found node.
		return node.getInfo();
	}

	@Override
	public T max() {
		if(this.isEmpty()) {
			//If this tree is empty,return null.
			return null;
		}
		//Get the root to node variable.
		BSTTreeNode<T> node = this.root;
		//Loop to find left node is null
		while(node.getRight() != null) {
			node = node.getRight();
		}
		//Return the info of found node.
		return node.getInfo();
	}

	@Override
	public Iterator<T> getIterator(Traversal orderType) {
		//Declare and initialize info collection
		ArrayList<T> infoArr = new ArrayList<T>();
		if (orderType == BSTInterface.Traversal.Inorder) {
			//Cell inorder method
			this.inOrder(this.root, infoArr);
		}else if(orderType == BSTInterface.Traversal.Preorder) {
			//Cell preorder method
			this.preOrder(this.root, infoArr);
		}else if(orderType == BSTInterface.Traversal.Postorder) {
			//Cell preorder method
			this.postOrder(this.root, infoArr);
		}
		//Get iterator
		return infoArr.iterator();
	}
	
	private void inOrder(BSTTreeNode<T> node,ArrayList<T> infoArr){
		if(node == null) {
			return;
		}
		this.inOrder(node.getLeft(),infoArr);
		infoArr.add(node.getInfo());
		this.inOrder(node.getRight(),infoArr);
	}
	
	private void preOrder(BSTTreeNode<T> node,ArrayList<T> infoArr){
		if(node == null) {
			return;
		}
		infoArr.add(node.getInfo());
		this.preOrder(node.getLeft(),infoArr);
		this.preOrder(node.getRight(),infoArr);
	}

	private void postOrder(BSTTreeNode<T> node,ArrayList<T> infoArr){
		if(node == null) {
			return;
		}
		this.postOrder(node.getLeft(),infoArr);
		this.postOrder(node.getRight(),infoArr);
		infoArr.add(node.getInfo());
	}
	
	@Override
	public int getSearchStepNum() {
		return this.stepNum;
	}

}
