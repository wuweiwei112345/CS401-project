package com.pro.imple;

import com.pro.entity.LLNode;

/**
 * @describe The implements is linked-based's unbounded sorted binary search list
 * @author Wei Wu
 */
public class LinkedUnBoundedListSortedBinaryImpl<T extends Comparable<T>> extends LinkedUnBoundedListSortedImpl<T>{

	public LinkedUnBoundedListSortedBinaryImpl() {
		super();
	}
	
	/**
	 * Get a element data by target element.(The method's complexity is O(log2N))
	 * @param target
	 * @return target data
	 */
	private void find(T target) {
		this.found = false;
		this.locationNode = null;
		this.preNode = null;
		if(!this.isEmpty()) {
			//The list is empty
			LLNode<T> startNode = this.head;
			int startIndex = 0;
			int endIndex = this.elementsNum - 1;
			int middleIndex = 0;
			while(startIndex < endIndex) {
				
				middleIndex = (startIndex + endIndex)/2;
				
				while(startIndex < middleIndex) {
					this.preNode = startNode;
					startNode = startNode.getNext();
					startIndex++;
				}
				
				if(target.compareTo(startNode.getInfo()) < 0) {
					endIndex = middleIndex - 1;
				}else if(target.compareTo(startNode.getInfo()) > 0) {
					startIndex = middleIndex + 1;
				}else {
					this.found = true;
					this.locationNode = startNode;
					break;
				}
			}
		}
	}
	
}
