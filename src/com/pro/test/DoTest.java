package com.pro.test;

import java.util.Iterator;

import com.pro.imple.BinarySearchTree;

public class DoTest {

	public static void main(String[] args) {
		BinarySearchTree<String> tree = new BinarySearchTree<String>();
		tree.add("a");
		tree.add("b");
		tree.add("c");
		tree.add("f");
		tree.add("d");
		tree.add("1");
		tree.add("2");
		tree.add("3");
		tree.add("4");
		tree.add("5");
		tree.add("6");
		tree.add("7");
		tree.add("8");
		tree.add("9");
		tree.add("10");
		tree.add("11");
		tree.remove("2");
		Iterator<String> iterator = tree.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(tree.search("b"));
		System.out.println(tree.search("q"));
		System.out.println(tree.contoins("b"));
		System.out.println(tree.contoins("q"));
		System.out.println(tree.size());
	}

}
