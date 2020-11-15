package com.pro.inter;

import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;

/**
 * @describe interface of list
 * @author wuwei
 */
public interface ListInterface<T> {

	/**
	 * Add a element object into list.If list is full throws OverflowException.
	 * @param element is 
	 * @return true is add success and false is add fail
	 */
	public boolean add(T element) throws OverflowException;
	
	/**
	 * Search element of list by expected goals in list
	 * @param target is expected goals
	 * @return T is element of found
	 */
	public T search(T target);
	
	/**
	 * Whether include target elements
	 * @param target is expected goals
	 * @return true is contain and false is not contain
	 */
	public boolean contoins(T target);
	
	/**
	 * Remove appoint element.If list is empty throws UnderflowException.
	 * @param target is expected goals
	 * @return true is add success and false is add fail
	 */
	public boolean remove(T target) throws UnderflowException;
	
	/**
	 * Whether is full for list
	 * @return true is full and false is not full
	 */
	public boolean isFull();
	
	/**
	 * Whether is empty for list
	 * @return true is empty and false is not empty
	 */
	public boolean isEmpty();
	
	/**
	 * Get size of list
	 * @return element number of list
	 */
	public int size();
	
}
