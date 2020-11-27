package com.pro.imple;

import com.pro.inter.ListInterface;

/**
 * @describe For create instantiation of object
 * @author Wei Wu
 */
public class SimpleFactory {

	public static ListInterface<String> createListImplByString(String code,int maxSize) {
		ListInterface<String> list = null;
		switch (code) {
			case "000001":
				list = new ArrayBoundedListSortedImpl<String>(maxSize);
				break;
			case "000002":
				list = new ArrayBoundedListImpl<String>(maxSize);
				break;
			case "000003":
				list = new ArrayUnBoundedListSortedImpl<String>();
				break;
			case "000004":
				list = new ArrayUnBoundedListImpl<String>();
				break;
			case "000005":
				list = null;
				break;
			case "000006":
				list = null;
				break;
			case "000007":
				list = null;
				break;
			case "000008":
				list = null;
				break;
			case "000009":
				list = new BinarySearchTree<String>();
				break;
			default:
				break;
			}
		return list;
	}
	
	public static ListInterface<Integer> createListImplByInteger(String code,int maxSize) {
		ListInterface<Integer> list = null;
		switch (code) {
			case "000001":
				list = new ArrayBoundedListSortedImpl<Integer>(maxSize);
				break;
			case "000002":
				list = new ArrayBoundedListImpl<Integer>(maxSize);
				break;
			case "000003":
				list = new ArrayUnBoundedListSortedImpl<Integer>();
				break;
			case "000004":
				list = new ArrayUnBoundedListImpl<Integer>();
				break;
			case "000005":
				list = null;
				break;
			case "000006":
				list = null;
				break;
			case "000007":
				list = null;
				break;
			case "000008":
				list = null;
				break;
			case "000009":
				list = new BinarySearchTree<Integer>();
				break;
			default:
				break;
			}
		return list;
	}
	
}
