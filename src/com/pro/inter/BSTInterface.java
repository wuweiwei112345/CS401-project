package com.pro.inter;

import java.util.Iterator;

/**
 * @describe Binary search tree interface
 * @author Wei Wu
 * @param <T>
 */
public interface BSTInterface<T> extends ListInterface<T>, Iterable<T> {

	/**
	 * The Order of iterator 
	 * @author wuwei
	 */
	public enum Traversal {Inorder,Preorder,Postorder};
	
	/**
	 * Get least node info in the tree
	 * @author wuwei
	 */
	public T min();
	
	/**
	 * Get maximal node info in the tree
	 * @author wuwei
	 */
	public T max();
	
	/**
	 * Get iterator with this tree
	 * @param orderType
	 * @return Iterator
	 */
	public Iterator<T> getIterator(BSTInterface.Traversal orderType);
	
}