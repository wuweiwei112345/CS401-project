package com.pro.imple;

import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

import com.pro.entity.LLNode;

/**
 * @describe The implements is linked-based's unbounded unsorted list
 * @author Ye Yu
 */
public class LinkedUnBoundedListImpl<T extends Comparable<T>> implements ListInterface<T> {
//	private int maxSize;
//	private final int defaultMaxSize = 10;
	private int numElements;//number of nodes
	private LLNode<T> head;//head node reference
	private boolean found;//matched->true, unmatched->false
	private LLNode<T> location;//reference to the node to which the find method matches
	private LLNode<T> previous;//reference to the previous node of the node to which the find method matches
	private int index;//subscript of find method
	private int stepNum;//Step execution times of search algorithm
//	private LLNode<T> currentNode;
//	private int listNum;
//	private LLNode<T> elements;
	
	@Override
	public boolean add(T element) throws OverflowException {
		//Declare the instantiation of a new node
		LLNode<T> newNode = new LLNode<T>(element);
		if(this.isEmpty())
		{
			//list is empty,set the new node to head
			this.head = newNode;
			//number of elements + 1
			numElements++;
			//return true
			return true;
		}
		//get the reference of head
		LLNode<T> currentNode = this.head;
		//loop
		while(currentNode.getNext() != null)
		{
			//Constantly getting the next node of current node
			currentNode = currentNode.getNext();
		}
		//Place new node next to tail
		currentNode.setNext(newNode);
		//number of elements + 1
		numElements++;
		//return true
		return true;
	}

	private int find(T element) {
		//Initializing variable
		this.found = false;
		this.location = null;
		this.previous = null;
		this.stepNum = 0;
		if(!(isEmpty()))
		{
			//list is not empty
			//get the reference of head
			LLNode<T> currentNode = this.head;
			//loop, find target
			while(currentNode != null)
			{
				//Number of additional steps
				this.stepNum++;
				if(element.compareTo(currentNode.getInfo()) == 0)
				{
					//target value = value to be compared
					this.found = true;
					this.location = currentNode;
					break;
				}else{
					//target value != value to be compared
					this.previous = currentNode;
					currentNode = currentNode.getNext();
				}
			}
		}
		return index;
    }
	
	@Override
	public T search(T target) {
		//call find method to find target
		this.find(target);
		if(this.found)
		{
			//Matched, returns the value of the matched object's Info property
			return this.location.getInfo();
		}else{
			//unmatched, return null
			return null;
		}
	}
	
	@Override
	public boolean contain(T target) {
		//call find method to find target
		this.search(target);
		//Return search results
		return this.found;
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		//call find method to find target
		this.find(target);
        if(this.found == true)
        {
        	//matched, delete current node
        	previous.setNext(location.getNext());
        	return true;
        }else {
        	//unmatched, return false
        	return false;
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

