package com.pro.imple;

import java.util.Comparator;
import java.util.Iterator;
import com.pro.entity.BSTTreeNode;
import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.BSTInterface;

/**
 * @describe Binary search tree
 * @author wuwei
 */
public class BinarySearchTree<T> implements BSTInterface<T> {

	private BSTTreeNode<T> root;
	private Comparator<T> comp;
	private int elementsNum = 0;
	private boolean found;
	private int location;
	
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
		return false;
	}

	@Override
	public T search(T target) {
		return null;
	}

	@Override
	public boolean contoins(T target) {
		return false;
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		return false;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public T min() {
		return null;
	}

	@Override
	public T max() {
		return null;
	}

	@Override
	public Iterator<T> getIterator(Traversal orderType) {
		return null;
	}

}
