package com.pro.imple;

import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

/**
 * @describe The implements is array-based's bounded list
 * @author Wei Wu
 */
public class ArrayBoundedListImpl<T> implements ListInterface<T> {
	
	private static final int DEFAULT_MAX_SIZE = 10;//默认最大元素数量上限
	private Object[] elements;//元素数组
	private int elementsNum = 0;//元素数量
	private boolean found;//find方法查找目标元素结果 true已匹配 false未匹配
	private int location;//find方法匹配到的元素下标
	
	//构造函数
	public ArrayBoundedListImpl() {
		//实例化元素数组用默认大小
		elements = new Object[DEFAULT_MAX_SIZE];
	}
	
	public ArrayBoundedListImpl(int size) {
		//实例化元素数组用size参数
		elements = new Object[size];
	}

	@Override
	public boolean add(T element) throws OverflowException {
		if(this.isFull()) {
			//The list is full
			throw new OverflowException("The list is full!");
		}
		//The element data into elementsNum of elements
		this.elements[elementsNum] = element;
		//Additional element number
		this.elementsNum++;
		//return true
		return true;
	}

	@Override
	public T search(T target) {
		//Try find the target
		this.find(target);
		if(this.found) {
			//The target element is found,return it.
			return (T)this.elements[this.location];
		}else {
			//Return null
			return null;
		}
	}

	@Override
	public boolean contain(T target) {
		//Try find the target
		this.find(target);
		//Return the result
		return this.found;
	}
	
	/**
	 * Get a element data by target element.(The method's complexity is O(N))
	 * @param target
	 * @return target data
	 */
	public void find(T target) {
		this.found = false;
		this.location = 0;
		if(!this.isEmpty()) {
			//The list is empty
			int index = 0;
			int arrNum = this.elementsNum;
			//Loop and find target element
			while(index < arrNum) {
				//Get element of array by index
				T element = ((T)this.elements[index]);
				if(element.equals(target)) {
					//Find is success and return the element object.
					this.found = true;
					this.location = index;
				}
				index++;
			}
		}
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		if(this.isEmpty()) {
			//The list is empty
			throw new UnderflowException("The list is empty!");
		}
		//Try find the target
		this.find(target);
		if(this.found) {
			//The target element is found,delete it.
			this.elements[this.location] = this.elements[this.elementsNum - 1];
			this.elementsNum--;
		}
		return this.found;
	}

	@Override
	public boolean isFull() {
		return (this.elementsNum == this.elements.length);
	}

	@Override
	public boolean isEmpty() {
		return (this.elementsNum == 0);
	}

	@Override
	public int size() {
		return this.elementsNum;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[");
		if(!this.isEmpty()) {
			//The list is empty
			int index = 0;
			int arrNum = this.elementsNum;
			//Loop and find target element
			while(index < arrNum) {
				//Get element and append into the sb variable
				if(this.elements[index] != null) {
					sb.append(",").append(this.elements[index]);
				}
				index++;
			}
		}
		//Return the string of sb
		return sb.append("]").toString().replaceFirst(",", "");
	}

}
