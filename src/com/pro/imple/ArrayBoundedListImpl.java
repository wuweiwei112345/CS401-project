package com.pro.imple;

import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

/**
 * @describe The implements is array-based's bounded list
 * @author wuwei
 */
public class ArrayBoundedListImpl<T> implements ListInterface<T> {
	
	private static final int DEFAULT_MAX_SIZE = 10;
	private Object[] elements;
	private int elementsNum = 0;
	
	public ArrayBoundedListImpl() {
		elements = new Object[DEFAULT_MAX_SIZE];
	}
	
	public ArrayBoundedListImpl(int size) {
		elements = new Object[size];
	}

	@Override
	public boolean add(T element) throws OverflowException {
		if(this.isFull()) {
			//The list is full
			throw new OverflowException("The list is full!");
		}
		//The element data into elementsNum of elements
		this.elements[elementsNum] = element;
		//Additional element number
		this.elementsNum++;
		//return true
		return true;
	}

	@Override
	public T search(T target) {
		//Get get method in this class
		return this.find(target);
	}

	@Override
	public boolean contoins(T target) {
		//Get get method in this class
		T element = this.find(target);
		//return true or false
		return !(element == null);
	}
	
	/**
	 * Get a element data by target element.(The method's complexity is O(N))
	 * @param target
	 * @return target data
	 */
	public T find(T target) {
		if(!this.isEmpty()) {
			//The list is empty
			int index = 0;
			int arrNum = this.elementsNum;
			//Loop and find target element
			while(index < arrNum) {
				//Get element of array by index
				T element = ((T)elements[index]);
				if(element.equals(target)) {
					//Find is success and return the element object.
					return element;
				}
				index++;
			}
		}
		//When find is fail return null.
		return null;
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		if(this.isEmpty()) {
			//The list is empty
			throw new UnderflowException("The list is empty!");
		}
		//The list is empty
		int index = 0;
		int arrNum = this.elementsNum;
		//Loop and find target element
		while(index < arrNum) {
			//Get element of array by index
			T element = ((T)elements[index]);
			if(element.equals(target)) {
				elements[index] = elements[arrNum - 1];
				this.elementsNum--;
				return true;
			}
			index++;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		return (this.elementsNum == elements.length);
	}

	@Override
	public boolean isEmpty() {
		return (this.elementsNum == 0);
	}

	@Override
	public int size() {
		return this.elementsNum;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("");
		if(!this.isEmpty()) {
			//The list is empty
			int index = 0;
			int arrNum = this.elementsNum;
			//Loop and find target element
			while(index < arrNum) {
				//Get element and append into the sb variable
				sb.append(elements[index]);
				index++;
			}
		}
		//Return the string of sb
		return sb.toString();
	}

}
