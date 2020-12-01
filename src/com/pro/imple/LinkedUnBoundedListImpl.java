package com.pro.imple;

import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

import com.pro.entity.LLNode;

/**
 * @describe The implements is linked-based's unbounded unsorted list
 * @author Ye Yu
 */
public class LinkedUnBoundedListImpl<T extends Comparable<T>> implements ListInterface<T> {
//	private int maxSize;
//	private final int defaultMaxSize = 10;
	private int numElements;//节点数量
	private LLNode<T> head;//头节点引用
	private boolean found;//true匹配成功 false匹配失败
	private LLNode<T> location;//find方法匹配到的节点的引用
	private LLNode<T> previous;//find方法匹配到的节点的前节点的引用
	private int index;//find方法的下标值
//	private LLNode<T> currentNode;
//	private int listNum;
//	private LLNode<T> elements;
	
	@Override
	public boolean add(T element) throws OverflowException {
		//声明实例化新节点
		LLNode<T> newNode = new LLNode<T>(element);
		if(this.isEmpty())
		{
			//列表为空,直接将新节点赋值给head变量
			this.head = newNode;
			//追加元素数量
			numElements++;
			//返回true
			return true;
		}
		//获得头节点引用
		LLNode<T> currentNode = this.head;
		//循环
		while(currentNode.getNext() != null)
		{
			//不断获取当前节点的下一个节点
			currentNode = currentNode.getNext();
		}
		//将新节点放到尾节点的next处
		currentNode.setNext(newNode);
		//追加元素数量
		numElements++;
		//返回true
		return true;
	}

	private int find(T element) {
		//初始化变量
		this.found = false;
		this.location = null;
		this.previous = null;
		if(!(isEmpty()))
		{
			//列表不为空
			//获取头部变量引用
			LLNode<T> currentNode = this.head;
			//循环,查找目标值
			while(currentNode != null)
			{
				if(element.compareTo(currentNode.getInfo()) == 0)
				{
					//目标值与对比值相等
					this.found = true;
					this.location = currentNode;
					break;
				}else{
					//目标值与对比值不相等
					this.previous = currentNode;
					currentNode = currentNode.getNext();
				}
			}
		}
		return index;
    }
	
	@Override
	public T search(T target) {
		//调用find方法查找目标元素
		this.find(target);
		if(this.found)
		{
			//已匹配,返回匹配对象info属性值
			return this.location.getInfo();
		}else{
			//未匹配,返回null
			return null;
		}
	}
	
	@Override
	public boolean contain(T target) {
		//调用find方法查找目标元素
		this.search(target);
		//返回查找结果
		return this.found;
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		//调用find方法查找目标元素
		this.find(target);
        if(this.found == true)
        {
        	//已匹配,删除当前节点
        	previous.setNext(location.getNext());
        	return true;
        }else {
        	//未匹配,则返回false
        	return false;
        }
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return this.numElements == 0;
	}

	@Override
	public int size() {
		return this.numElements;
	}
	
	public String toString() {
    	//声明并实例化StringBuffer实例
    	StringBuffer sb = new StringBuffer("[");
    	//获取头节点引用
        LLNode<T> currentNode = this.head;
        //循环
        while(currentNode != null)
   		{
        	//拼接数据
   			sb.append(",").append(currentNode.getInfo());
   			//获取下一个节点引用
   			currentNode = currentNode.getNext();
   		}
        //拼接结束符号
        sb.append("]");
        //返回数据字符
        return sb.toString().replaceFirst(",", "");
    }
}

