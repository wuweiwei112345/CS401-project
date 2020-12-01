package com.pro.imple;

import com.pro.entity.LLNode;

/**
 * @describe The implements is linked-based's unbounded sorted binary search list
 * @author Ye Yu
 */
public class LinkedUnBoundedListSortedBinaryImpl<T extends Comparable<T>> extends LinkedUnBoundedListSortedImpl<T>{

	//构造函数
	public LinkedUnBoundedListSortedBinaryImpl() {
		super();
	}
	
	/**
	 * Get a element data by target element.(The method's complexity is O(log2N))
	 * @param target
	 * @return target data
	 */
	private void find(T target) {
		//还原变量初始值
		this.found = false;
		this.locationNode = null;
		this.preNode = null;
		if(!this.isEmpty()) {
			//The list is empty
			//获取头部节点引用
			LLNode<T> startNode = this.head;
			//起始下标
			int startIndex = 0;
			//结束下标
			int endIndex = this.elementsNum - 1;
			//中间下标
			int middleIndex = 0;
			//循环(当startIndex < endIndex == true 时停止)
			while(startIndex < endIndex) {
				//计算中间下标
				middleIndex = (startIndex + endIndex)/2;
				//从起始点开始不断向后进行遍历，直到遍历到middleIndex处结束,以找到中间下标指向的节点引用
				while(startIndex < middleIndex) {
					this.preNode = startNode;
					startNode = startNode.getNext();
					startIndex++;
				}
				//目标值与中间节点值进行比较
				if(target.compareTo(startNode.getInfo()) < 0) {
					//缩小遍历范围,将endIndex设置为middleIndex - 1的位置
					endIndex = middleIndex - 1;
				}else if(target.compareTo(startNode.getInfo()) > 0) {
					//缩小遍历范围,将startIndex设置为middleIndex + 1的位置
					startIndex = middleIndex + 1;
				}else {
					//目标值与中间节点值相等
					this.found = true;
					this.locationNode = startNode;
					break;
				}
			}
		}
	}
	
}
