package com.pro.imple;

import com.pro.entity.LLNode;

/**
 * @describe The implements is linked-based's unbounded sorted binary search list
 * @author Ye Yu
 */
public class LinkedUnBoundedListSortedBinaryImpl<T extends Comparable<T>> extends LinkedUnBoundedListSortedImpl<T>{

	//constructor
	public LinkedUnBoundedListSortedBinaryImpl() {
		super();
	}
	
	/**
	 * Get a element data by target element.(The method's complexity is O(log2N))
	 * @param target
	 * @return target data
	 */
	private void find(T target) {
		//Restore the initial value of the variable
		this.found = false;
		this.locationNode = null;
		this.preNode = null;
		this.stepNum = 0;
		if(!this.isEmpty()) {
			//The list is empty
			//get the reference of head
			LLNode<T> startNode = this.head;
			//start subscript
			int startIndex = 0;
			//end subscript
			int endIndex = this.elementsNum - 1;
			//middle subscript 
			int middleIndex = 0;
			//loop(stops when startIndex < endIndex == true)
			while(startIndex < endIndex) {
				//Calculate middle subscript
				middleIndex = (startIndex + endIndex)/2;
				//Number of additional steps
				this.stepNum++;
				//traversal continues backwards from starting point until ends at middleIndex, to find the node reference to which middle index points
				while(startIndex < middleIndex) {
					this.preNode = startNode;
					startNode = startNode.getNext();
					startIndex++;
				}
				//compare target value to middle node value
				if(target.compareTo(startNode.getInfo()) < 0) {
					//Narrow the traversal scope and set endIndex to the location of middleindex-1
					endIndex = middleIndex - 1;
				}else if(target.compareTo(startNode.getInfo()) > 0) {
					//Narrow the traversal scope and set startIndex to the location of middleIndex + 1
					startIndex = middleIndex + 1;
				}else {
					//target value = middle node value
					this.found = true;
					this.locationNode = startNode;
					break;
				}
			}
		}
	}
	
}
