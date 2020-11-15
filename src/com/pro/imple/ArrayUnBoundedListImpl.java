package com.pro.imple;

import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

/**
 * @describe The implements is array-based's unbounded list
 * @author wuwei
 */
public class ArrayUnBoundedListImpl<T> implements ListInterface<T> {

	@Override
	public boolean add(Object element) throws OverflowException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object search(Object target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contoins(Object target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object target) throws UnderflowException {
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
