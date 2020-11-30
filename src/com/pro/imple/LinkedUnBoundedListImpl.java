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
	private int numElements;
	private LLNode<T> head;
	private boolean found;
	private LLNode<T> location;
	private LLNode<T> previous;
	private int index;
//	private LLNode<T> currentNode;
//	private int listNum;
//	private LLNode<T> elements;
	
	@Override
	public boolean add(T element) throws OverflowException {
		// TODO Auto-generated method stub
		LLNode<T> newNode = new LLNode<T>(element);
		if(this.isEmpty())
		{
			this.head = newNode;
			numElements++;
			return true;
		}

		LLNode<T> currentNode = this.head;
		while(currentNode.getNext() != null)
		{
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(newNode);
		numElements++;
		return true;
	}

	private int find(T element) {
		this.found = false;
		this.location = null;
		this.previous = null;
		if(!(isEmpty()))
		{
			LLNode<T> currentNode = this.head;
			while(currentNode != null)
			{
				if(element.compareTo(currentNode.getInfo()) == 0)
				{
					this.found = true;
					this.location = currentNode;
					break;
				}else{
					this.previous = currentNode;
					currentNode = currentNode.getNext();
				}
			}
		}
		return index;
    }
	
	@Override
	public T search(T target) {
		// TODO Auto-generated method stub
		this.find(target);
		if(this.location != null)
		{
			return this.location.getInfo();
		}else{
			return null;
		}
	}
	
	@Override
	public boolean contain(T target) {
		// TODO Auto-generated method stub
		this.search(target);
		return this.found;
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		// TODO Auto-generated method stub
		this.find(target);
        if(this.found == true)
        {
        	previous.setNext(location.getNext());
        	return true;
        }else {
        	return false;
        }
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
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

