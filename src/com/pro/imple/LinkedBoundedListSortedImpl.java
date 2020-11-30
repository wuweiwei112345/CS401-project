package com.pro.imple;

import com.pro.entity.LLNode;
import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

/**
 * @describe The implements is linked-based's bounded sorted list
 * @author Ye Yu
 */
public class LinkedBoundedListSortedImpl<T extends Comparable<T>> implements ListInterface<T> {
	
	public LinkedBoundedListSortedImpl() {
		this.maxSize = DEFAULT_MAX_SIZE;
	}
	
	public LinkedBoundedListSortedImpl(int maxSize) {
		this.maxSize = maxSize;
	}

	protected static final int DEFAULT_MAX_SIZE = 10;
	protected int maxSize = 0;
	protected LLNode<T> head;
	protected int elementsNum = 0;
	protected boolean found;
	protected LLNode<T> locationNode;
	protected LLNode<T> preNode;
	protected int numElements;
	protected int location;
	
	@Override
	public boolean add(T element) throws OverflowException {
		// TODO Auto-generated method stub
		if(this.isFull()){
			throw new OverflowException("The list is full.");
		}
		if(this.isEmpty())
		{
			this.head = new LLNode<T>(element);
		}else {
			this.find(element);
			LLNode<T> newNode = new LLNode<T>(element);
			if(this.locationNode == null) {
				newNode.setNext(this.head);
				this.head = newNode;
			}else {
				newNode.setNext(this.locationNode.getNext());
				this.locationNode.setNext(newNode);
			}
		}
		this.numElements++;
		return true;
	}

	@Override
	public T search(T target) {
		// TODO Auto-generated method stub
		if(!(isEmpty())){
			this.find(target);
			if(this.found) {
				return locationNode.getInfo();
			}
		}
		return null;
	}

	@Override
	public boolean contain(T target) {
		// TODO Auto-generated method stub
		if(!(isEmpty())){
			this.find(target);
			return this.found;
		}
			return false;
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			throw new OverflowException("The list is full.");
		}else {
			this.find(target);
			if(this.found) {
				preNode.setNext(this.locationNode.getNext());
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
			this.found = false;
			this.location = -1;
			this.preNode = null;
			this.locationNode = null;
			LLNode<T> currentNode = this.head;
			int index = 0;
			while(currentNode != null)
			{
				if(target.compareTo(currentNode.getInfo()) == 0)
				{
					this.found = true;
					this.location=index;
					this.locationNode = currentNode;
					break;
				}else if(target.compareTo(currentNode.getInfo()) > 0)
				{
					this.location = index;
					this.locationNode = currentNode;
				}
				this.preNode = currentNode;
				currentNode = currentNode.getNext();
				index++;
			}
		}
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return this.numElements == this.maxSize;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.numElements == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.numElements;
	}
	
    public String toString() {
    	StringBuffer sb = new StringBuffer("[");
    	
        LLNode<T> currentNode = this.head;
        while(currentNode != null)
   		{
   			sb.append(",").append(currentNode.getInfo());
   			currentNode = currentNode.getNext();
   		}
        
        sb.append("]");
        return sb.toString().replaceFirst(",", "");
    }

}
