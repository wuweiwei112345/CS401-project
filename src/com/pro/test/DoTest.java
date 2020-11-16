package com.pro.test;

import com.pro.imple.ArrayUnBoundedListImpl;

public class DoTest {

	public static void main(String[] args) {
		ArrayUnBoundedListImpl<String> list = new ArrayUnBoundedListImpl<String>(10);
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("f");
		list.add("d");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		list.add("11");
		System.out.println(list.toString());
		System.out.println(list.search("b"));
		System.out.println(list.search("q"));
		System.out.println(list.contoins("b"));
		System.out.println(list.contoins("q"));
		System.out.println(list.size());
	}

}
