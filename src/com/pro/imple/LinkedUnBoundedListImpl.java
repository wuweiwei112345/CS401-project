package com.pro.imple;

import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

/**
 * @describe 链表无界列表实现
 * @author wuwei
 */
public class LinkedUnBoundedListImpl<T> implements ListInterface<T> {

	@Override
	public boolean add(T element) throws OverflowException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T search(T target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contoins(T target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
