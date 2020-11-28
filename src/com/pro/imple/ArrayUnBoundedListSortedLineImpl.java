package com.pro.imple;

public class ArrayUnBoundedListSortedLineImpl<T extends Comparable<T>> extends ArrayUnBoundedListSortedImpl<T>{
	
	public ArrayUnBoundedListSortedLineImpl() {
		super();
		this.elements = new Object[INITIAL_CAPACITY];
	}
	
	/**
	 * Get a element data by target element.(The method's complexity is O(N))
	 * @param target
	 * @return target data
	 */
	@Override
	public void find(T target) {
		this.found = false;
		this.location = 0;
		if(!this.isEmpty()) {
			int elementsNum = this.elementsNum;
			int index = 0;
			while(index < elementsNum) {
				if(this.elements[index] == target) {
					this.found = true;
					this.location = index;
				}
				index++;
			}
		}
	}

}
