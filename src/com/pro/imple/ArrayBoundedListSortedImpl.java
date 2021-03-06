package com.pro.imple;

import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

/**
 * @describe The implements is array-based's bounded sorted list
 * @author Wei Wu
 */
public class ArrayBoundedListSortedImpl<T extends Comparable<T>> implements ListInterface<T> {

	protected static final int DEFAULT_MAX_SIZE = 10;//default maximum number of elements
	protected Object[] elements;//array for elements
	protected int elementsNum = 0;//number of elements
	protected boolean found;//find method finds the result of the target element: matched->true, unmatched->false
	protected int location;//element subscript to which the find method matches
	protected int stepNum;//Step execution times of search algorithm
	
	//constructor
	public ArrayBoundedListSortedImpl() {
		//Instantiate the array of elements with the default size
		this.elements = new Object[DEFAULT_MAX_SIZE];
	}
	
	public ArrayBoundedListSortedImpl(int size) {
		//Instantiate the array of elements with the size parameter
		this.elements = new Object[size];
	}
	
	@Override
	public boolean add(T element) throws OverflowException {
		if(this.isFull()) {
			//The list is full
			throw new OverflowException("The list is full!");
		}
		//Find the location subscript needed in the Add method
		this.find(element);
		//Loop and move element to next location of index
		for(int i = this.elementsNum - 1 ; i >= this.location ; i--) {
			this.elements[i + 1] = this.elements[i];
			this.elements[i] = null;
		}
		//Add the element into location + 1
		this.elements[this.location] = element;
		//element number + 1
		this.elementsNum++;
		//Return true
		return true;
	}

	@Override
	public T search(T target) {
		//Find location index by target
		this.find(target);
		if(this.found) {
			//Get element by location
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
		//Try to find the target
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
	private void find(T target) {
		this.found = false;
		this.location = 0;
		this.stepNum = 0;
		if(!this.isEmpty()) {
			//The list is empty,binary search
			int first = 0;
			int last = this.elementsNum - 1;
			int middleIndex = 0;
			while(first <= last) {
				middleIndex = (first + last) / 2;
				//Number of additional steps
				this.stepNum++;
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
		return (this.elementsNum == this.elements.length);
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
		StringBuffer sb = new StringBuffer("[");
		if(!this.isEmpty()) {
			//The list is empty
			int index = 0;
			int arrNum = this.elementsNum;
			//Loop and find target element
			while(index < arrNum) {
				//Get element and append into the sb variable
				if(this.elements[index] != null) {
					sb.append(",").append(this.elements[index]);
				}
				index++;
			}
		}
		//Return the string of sb
		return sb.append("]").toString().replaceFirst(",", "");
	}
	
	@Override
	public int getSearchStepNum() {
		return this.stepNum;
	}

}
