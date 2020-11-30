package com.pro.imple;

/**
 * @describe The implements is array-based's bounded sorted line search list
 * @author Wei Wu
 */
public class ArrayBoundedListSortedLineImpl<T extends Comparable<T>> extends ArrayBoundedListSortedImpl<T>{
	
	public ArrayBoundedListSortedLineImpl() {
		super();
		this.elements = new Object[DEFAULT_MAX_SIZE];
	}
	
	public ArrayBoundedListSortedLineImpl(int size) {
		super();
		this.elements = new Object[size];
	}
	
	/**
	 * Get a element data by target element.(The method's complexity is O(N))
	 * @param target
	 * @return target data
	 */
	private void find(T target) {
		this.found = false;
		this.location = 0;
		if(!this.isEmpty()) {
			int elementsNum = this.elementsNum;
			int index = 0;
			while(index < elementsNum) {
				int result = target.compareTo((T)this.elements[index]);
				if(result == 0) {
					this.found = true;
					this.location = index;
				}else if(result > 0) {
					this.location = index + 1;
				}
				index++;
			}
		}
	}

}
