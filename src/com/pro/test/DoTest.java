package com.pro.test;

import com.pro.imple.LinkedBoundedListImpl;
import com.pro.imple.SimpleFactory;
import com.pro.inter.ListInterface;

public class DoTest {

	public static void main(String[] args) {
		ListInterface<Integer> list;
		list = new LinkedBoundedListImpl(100);

		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.search(6);
//		list.remove(8);
		System.out.println(list);
		System.out.println(list.size());
	}

}
