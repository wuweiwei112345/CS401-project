package com.pro.imple;

/**
 * @describe The implements is array-based's unbounded sorted line search list
 * @author Wei Wu 
 */
public class ArrayUnBoundedListSortedLineImpl<T extends Comparable<T>> extends ArrayUnBoundedListSortedImpl<T>{
	
	public ArrayUnBoundedListSortedLineImpl() {
		super();
		//Instantiate the array of elements with the default size
		this.elements = new Object[INITIAL_CAPACITY];
	}
	
	/**
	 * Get a element data by target element.(The method's complexity is O(N))
	 * @param target
	 * @return target data
	 */
	private void find(T target) {
		//Restore the initial values of the found and location variables
		this.found = false;
		this.location = 0;
		this.stepNum = 0;
		if(!this.isEmpty()) {
			//when the array is not empty
			//Gets the current number of elements
			int elementsNum = this.elementsNum;
			//Declare and initialize the index variable
			int index = 0;
			//loop and compare target and the value to compare
			while(index < elementsNum) {
				//Number of additional steps
				this.stepNum++;
				int result = target.compareTo((T)this.elements[index]);
				if(result == 0) {
					//if equals
					this.found = true;
					this.location = index;
				}else if(result > 0) {
					//target > the value to compare
					this.location = index + 1;
				}
				//index + 1
				index++;
			}
		}
	}

}
