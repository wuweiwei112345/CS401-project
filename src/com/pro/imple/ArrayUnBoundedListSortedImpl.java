package com.pro.imple;

import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

/**
 * @describe The implements is array-based's unbounded sorted list
 * @author Wei Wu 
 */
public class ArrayUnBoundedListSortedImpl<T extends Comparable<T>> implements ListInterface<T> {

	protected static final int INITIAL_CAPACITY = 100;
	protected Object[] elements;
	protected int elementsNum = 0;
	protected boolean found;
	protected int location;
	
	public ArrayUnBoundedListSortedImpl() {
		this.elements = new Object[INITIAL_CAPACITY];
	}
	
	public ArrayUnBoundedListSortedImpl(int capacity) {
		this.elements = new Object[capacity];
	}
	
	@Override
	public boolean add(T element) throws OverflowException {
		if(this.elementsNum == this.elements.length) {
			//Expand capacity
			this.capacity();
		}
		//Find location index of add
		this.find(element);
		//Loop and move element of after of location index
		for(int i = this.elementsNum - 1 ; i >= this.location ; i--) {
			this.elements[i + 1] = this.elements[i];
			this.elements[i] = null;
		}
		//The element data into elementsNum of elements
		this.elements[this.location] = element;
		//Additional element number
		this.elementsNum++;
		//return true
		return true;
	}
	
	/**
	 * Expand capacity for elements.
	 */
	private void capacity() {
		//Create a new array
		Object[] newElements = new Object[this.getNewArraySize()];
		Object[] elements = this.elements;
		//Copy the elements's data into the newElements
		int elementsLen = elements.length;
		//Loop and find target element
		for(int i = 0 ; i < elementsLen ; i++) {
			newElements[i] = elements[i];
		}
		//The newElements is this elements
		this.elements = newElements;
	}
	
	/**
	 * Get new elements size.
	 */
	private int getNewArraySize() {
		int length = this.elements.length; 
		int newSize = (int) (length + length * 0.5);
		return newSize;
	}

	@Override
	public T search(T target) {
		//Find location index by target
		this.find(target);
		if(this.found) {
			//Get element by this location
			return (T)elements[this.location];
		}else {
			return null;
		}
	}

	@Override
	public boolean contain(T target) {
		//Find by target
		this.find(target);
		//Return result
		return this.found;
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		if(this.isEmpty()) {
			//The list is empty
			throw new UnderflowException("The list is empty!");
		}
		//Try find the target
		this.find(target);
		if(this.found) {
			//The target element is found,delete it.
			for(int i = this.location ; i < this.elementsNum ; i++) {
				this.elements[i] = this.elements[i + 1];
			}
		}
		return this.found;
	}
	
	/**
	 * Get a element data by target element.(The method's complexity is O(log2N))
	 * @param target
	 * @return target data
	 */
	public void find(T target) {
		this.found = false;
		this.location = 0;
		if(!this.isEmpty()) {
			//The list is empty,binary search
			int first = 0;
			int last = this.elementsNum - 1;
			int middleIndex = 0;
			while(first <= last) {
				middleIndex = (first + last) / 2;
				if(target.compareTo((T)this.elements[middleIndex]) < 0) {
					last = middleIndex - 1;
				}else if(target.compareTo((T)this.elements[middleIndex]) > 0) {
					first = middleIndex + 1;
					this.location = middleIndex + 1;
				}else {
					this.location = middleIndex;
					this.found = true;
					break;
				}
			}
		}
	}

	@Override
	public boolean isFull() {
		return false;
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
				if(this.elements[index] != null) {
					sb.append(this.elements[index]).append(",");
				}
				index++;
			}
		}
		//Return the string of sb
		return sb.toString();
	}

}
