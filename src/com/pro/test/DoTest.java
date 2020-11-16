package com.pro.test;

import com.pro.imple.ArrayBoundedListImpl;

public class DoTest {

	public static void main(String[] args) {
		ArrayBoundedListImpl<String> list = new ArrayBoundedListImpl<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("f");
		list.add("d");
		list.add("e");
		list.remove("f");
		System.out.println(list.toString());
		System.out.println(list.search("b"));
		System.out.println(list.search("q"));
		System.out.println(list.contoins("b"));
		System.out.println(list.contoins("q"));
		System.out.println(list.size());
	}

}
