package com.pro.imple;

import com.pro.entity.LLNode;
import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

/**
 * @describe The implements is linked-based's unbounded sorted list
 * @author Ye Yu
 */
public class LinkedUnBoundedListSortedImpl<T extends Comparable<T>> implements ListInterface<T> {
	
	protected LLNode<T> head;//reference of head node
	protected int elementsNum = 0;//number of nodes
	protected boolean found;//matched->true, unmatched->false
	protected LLNode<T> locationNode;//matched node reference
	protected LLNode<T> preNode;//previous node reference
	private int numElements;//number of nodes
	private int location;//subscript of matched nodes
	protected int stepNum;//Step execution times of search algorithm
	
	@Override
	public boolean add(T element) throws OverflowException {
		if(this.isEmpty())
		{
			//list is empty, new node is instantiated and set to head
			this.head = new LLNode<T>(element);
		}else {
			//Call find method to find the appropriate insertion location for element
			this.find(element);
			//Declare and instantiate new node
			LLNode<T> newNode = new LLNode<T>(element);
			if(this.locationNode == null) {
				//Insert new node into the list as head
				newNode.setNext(this.head);
				this.head = newNode;
			}else {
				//Insert new node into the list
				newNode.setNext(this.locationNode.getNext());
				this.locationNode.setNext(newNode);
			}
		}
		//number of nodes + 1
		this.numElements++;
		return true;
	}

	@Override
	public T search(T target) {
		if(!(isEmpty())){
			//list is not empty, call find method to find target
			this.find(target);
			if(this.found) {
				//matched, return the info of matching node
				return locationNode.getInfo();
			}
		}
		//return null
		return null;
	}

	@Override
	public boolean contain(T target) {
		if(!(isEmpty())){
			//list is not empty, call find method to find target
			this.find(target);
			//Return search result
			return this.found;
		}
		//list is empty, return false
		return false;
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		if(isEmpty())
		{
			throw new OverflowException("The list is full.");
		}else {
			//list is not empty, call find method to search for target
			this.find(target);
			if(this.found) {
				//if matched, delete current node
				preNode.setNext(this.locationNode.getNext());
				//number of elements - 1
				this.numElements--;
			}
		}
		return this.found;
	}

	/**
	 * Get a element data by target element.(The method's complexity is O(N))
	 * @param target
	 * @return target data
	 */
	private void find(T target) {
		if(!(isEmpty()))
		{
			//list is not empty, restoring the initial value of the variable
			this.found = false;
			this.location = -1;
			this.preNode = null;
			this.locationNode = null;
			this.stepNum = 0;
			//get the reference of head
			LLNode<T> currentNode = this.head;
			//Initialize index variable
			int index = 0;
			//loop(stops when currentNode = null)
			while(currentNode != null)
			{
				//Number of additional steps
				this.stepNum++;
				if(target.compareTo(currentNode.getInfo()) == 0)
				{
					//target value = value to be compared
					this.found = true;
					this.location=index;
					this.locationNode = currentNode;
					//end loop
					break;
				}else if(target.compareTo(currentNode.getInfo()) > 0)
				{
					//target value > value to be compared
					this.location = index;
					this.locationNode = currentNode;
				}
				//set the value of current node to the previous node reference
				this.preNode = currentNode;
				//Get the next node of the current node
				currentNode = currentNode.getNext();
				//index + 1
				index++;
			}
		}
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return this.numElements == 0;
	}

	@Override
	public int size() {
		return this.numElements;
	}
	
	public String toString() {
		//Declare and instantiate a StringBuffer instance
    	StringBuffer sb = new StringBuffer("[");
    	//get the reference of head node
        LLNode<T> currentNode = this.head;
        //loop
        while(currentNode != null)
   		{
        	//splicing data
   			sb.append(",").append(currentNode.getInfo());
   			//Get the next node reference
   			currentNode = currentNode.getNext();
   		}
        //splice the end symbol
        sb.append("]");
        //return data character
        return sb.toString().replaceFirst(",", "");
    }
	
	@Override
	public int getSearchStepNum() {
		return this.stepNum;
	}

}
