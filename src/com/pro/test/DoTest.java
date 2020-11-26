package com.pro.test;

import com.pro.imple.SimpleFactory;
import com.pro.inter.ListInterface;

public class DoTest {

	public static void main(String[] args) {
		ListInterface<Integer> list = SimpleFactory.createListImplByInteger("000003",20);
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(100);
		list.add(124);
		list.add(5);
		list.add(7);
		list.add(15);
		list.add(67);
		list.add(19);
		list.add(6);
		list.add(18);
		list.add(11);
		list.add(27);
		list.add(40);
		list.add(16);
		list.remove(6);
		System.out.println(list.toString());
		System.out.println(list.search(8));
		System.out.println(list.search(10));
		System.out.println(list.contain(8));
		System.out.println(list.contain(10));
		System.out.println(list.size());
	}

}
