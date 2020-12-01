package com.pro.imple;

import com.pro.entity.LLNode;
import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

/**
 * @describe The implements is linked-based's bounded unsorted list
 * @author Ye Yu
 */
public class LinkedBoundedListImpl<T extends Comparable<T>> implements ListInterface<T> {

	private int maxSize;//Maximum number of nodes
	private final int defaultMaxSize = 10;//default maximum number of nodes
	private int numElements;//number of nodes
	private LLNode<T> head;//Header node reference
	private boolean found;//matched->true, unmatched->false
	private LLNode<T> location;//A reference to the node to which the find method matches
	private LLNode<T> previous;//A reference to the previous node of the node to which the find method matches
	private int stepNum;//Step execution times of search algorithm
//	private int listNum;
//	private int index;
//	private LLNode<T> elements;
	
	//constructor
	public LinkedBoundedListImpl()
	{
		//Set the maximum to the default maximum
		this.maxSize = this.defaultMaxSize;
	}
	
	public LinkedBoundedListImpl(int maxSize)
	{
		//The maximum limit is set to the maxSize variable
		this.maxSize = maxSize;
	}
	
	@Override
	public boolean add(T element) throws OverflowException {
		// TODO Auto-generated method stub
		if(this.isFull())
		{
			throw new OverflowException("The list is full.");
		}
		//Declare the instantiation of a new node
		LLNode<T> newNode = new LLNode<T>(element);
		if(this.isEmpty())
		{
			//if list is empty,set new node to the head
			this.head = newNode;
			//number of element + 1
			numElements++;
			//return true
			return true;
		}
		//get the reference of head
		LLNode<T> currentNode = this.head;
		//loop
		while(currentNode.getNext() != null)
		{
			//Constantly getting next node of current node
			currentNode = currentNode.getNext();
		}
		//Place new node next to tail node
		currentNode.setNext(newNode);
		//number of elements + 1
		numElements++;
		//return true
		return true;
	}

	private void find(T target) {
		//Initializing variable
		this.found = false;
		this.location = null;
		this.previous = null;
		this.stepNum = 0;
		if(!(isEmpty()))
		{
			//when the list is not empty
			//Get the head reference
			LLNode<T> currentNode = this.head;
			//loop and find the target value
			while(currentNode != null)
			{
				//Number of additional steps
				this.stepNum++;
				if(target.compareTo(currentNode.getInfo()) == 0)
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
	}
	
	@Override
	public T search(T target) {
		//Call find method to find the target element
		this.find(target);
		if(this.found)
		{
			//if matched, return the value of the matched object's Info property
			return this.location.getInfo();
		}else{
			//if unmatched, return null
			return null;
		}
	}

	@Override
	public boolean contain(T target) {
		//Call find method to find the target element
		this.find(target);
		//return the result of found
		return this.found;
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		//Call find method to find the target element
        this.find(target);
        if(this.found)
        {
        	//if matched, delete current node
        	previous.setNext(location.getNext());
        	return true;
        }else {
        	//if unmatched, return false
        	return false;
        }
	}

	@Override
	public boolean isFull() {
		return this.numElements == this.maxSize;
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
    	//Get the head node reference
        LLNode<T> currentNode = this.head;
        //loop
        while(currentNode != null)
   		{
        	//Splicing data
   			sb.append(",").append(currentNode.getInfo());
   		//Get the reference of next node
   			currentNode = currentNode.getNext();
   		}
        //splice end symbol
        sb.append("]");
        //Return data character
        return sb.toString().replaceFirst(",", "");
    }
    
    @Override
	public int getSearchStepNum() {
		return this.stepNum;
	}

}
