package com.pro.imple;

import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

/**
 * @describe The implements is array-based's unbounded list
 * @author Wei Wu
 */
public class ArrayUnBoundedListImpl<T> implements ListInterface<T> {

	private static final int INITIAL_CAPACITY = 100;//Default initial capacity
	private Object[] elements;//array for elements
	private int elementsNum = 0;//number of elements
	private boolean found;//find method finds the result of the target element: matched->true, unmatched->false
	private int location;//element subscript to which the find method matches
	private int stepNum;//Step execution times of search algorithm
	
	//constructor
	public ArrayUnBoundedListImpl() {
		//Instantiate the array of elements with the default size
		this.elements = new Object[INITIAL_CAPACITY];
	}
	
	public ArrayUnBoundedListImpl(int capacity) {
		//Instantiate the array of elements with the size parameter
		this.elements = new Object[capacity];
	}
	
	@Override
	public boolean add(T element) throws OverflowException {
		if(this.elementsNum == this.elements.length) {
			//Expand capacity
			this.capacity();
		}
		//The element data into elementsNum of elements
		this.elements[elementsNum] = element;
		//element number + 1
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
		//Try to find the target
		this.find(target);
		if(this.found) {
			//The target element is found,return it.
			return (T)this.elements[this.location];
		}else {
			//Return null
			return null;
		}
	}

	@Override
	public boolean contain(T target) {
		//Try to find the target
		this.find(target);
		//Return the result
		return this.found;
	}
	
	/**
	 * Get a element data by target element.(The method's complexity is O(N))
	 * @param target
	 * @return target data
	 */
	public void find(T target) {
		this.found = false;
		this.location = 0;
		this.stepNum = 0;
		if(!this.isEmpty()) {
			//The list is empty
			int index = 0;
			int arrNum = this.elementsNum;
			//Loop and find target element
			while(index < arrNum) {
				//Get element of array by index
				T element = ((T)this.elements[index]);
				//Number of additional steps
				this.stepNum++;
				if(element.equals(target)) {
					//Find is successful and return the element object.
					this.found = true;
					this.location = index;
				}
				index++;
			}
		}
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
			this.elements[this.location] = this.elements[this.elementsNum - 1];
			this.elementsNum--;
		}
		return this.found;
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
