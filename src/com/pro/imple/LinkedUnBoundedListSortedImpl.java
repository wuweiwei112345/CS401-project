package com.pro.imple;

import com.pro.entity.LLNode;
import com.pro.exception.OverflowException;
import com.pro.exception.UnderflowException;
import com.pro.inter.ListInterface;

/**
 * @describe The implements is linked-based's unbounded sorted list
 * @author Ye Yu
 */
public class LinkedUnBoundedListSortedImpl<T extends Comparable<T>> implements ListInterface<T> {
	
	protected LLNode<T> head;//头部节点引用
	protected int elementsNum = 0;//列表节点数量
	protected boolean found;//true已匹配 false未匹配
	protected LLNode<T> locationNode;//已匹配到的节点引用
	protected LLNode<T> preNode;//前节点引用
	private int numElements;//列表节点数量
	private int location;//已匹配到的节点下标
	
	@Override
	public boolean add(T element) throws OverflowException {
		if(this.isEmpty())
		{
			//列表为空,实例化新节点对象并赋值给head变量
			this.head = new LLNode<T>(element);
		}else {
			//调用find方法查找element适合插入的位置
			this.find(element);
			//声明并实例化新节点
			LLNode<T> newNode = new LLNode<T>(element);
			if(this.locationNode == null) {
				//将新节点作为头部插入到列表中
				newNode.setNext(this.head);
				this.head = newNode;
			}else {
				//将新节点插入到列表中
				newNode.setNext(this.locationNode.getNext());
				this.locationNode.setNext(newNode);
			}
		}
		//追加节点数量
		this.numElements++;
		return true;
	}

	@Override
	public T search(T target) {
		if(!(isEmpty())){
			//列表不为空,调用find方法查找目标对象
			this.find(target);
			if(this.found) {
				//已匹配直接返回匹配节点info值
				return locationNode.getInfo();
			}
		}
		//return null
		return null;
	}

	@Override
	public boolean contain(T target) {
		if(!(isEmpty())){
			//列表不为空,调用find方法查找目标对象
			this.find(target);
			//返回查找结果
			return this.found;
		}
		//列表为空,直接返回false
		return false;
	}

	@Override
	public boolean remove(T target) throws UnderflowException {
		if(isEmpty())
		{
			throw new OverflowException("The list is full.");
		}else {
			//列表不为空,调用find方法搜索目标元素
			this.find(target);
			if(this.found) {
				//已匹配,删除当前节点
				preNode.setNext(this.locationNode.getNext());
				//元素数量递减
				this.numElements--;
			}
		}
		return this.found;
	}

	/**
	 * Get a element data by target element.(The method's complexity is O(N))
	 * @param target
	 * @return target data
	 */
	private void find(T target) {
		if(!(isEmpty()))
		{
			//列表不为空,还原变量初始值
			this.found = false;
			this.location = -1;
			this.preNode = null;
			this.locationNode = null;
			//获取头部节点引用
			LLNode<T> currentNode = this.head;
			//初始化index变量
			int index = 0;
			//循环(当currentNode != null不成立时停止)
			while(currentNode != null)
			{
				if(target.compareTo(currentNode.getInfo()) == 0)
				{
					//目标值等于对比值
					this.found = true;
					this.location=index;
					this.locationNode = currentNode;
					//结束循环
					break;
				}else if(target.compareTo(currentNode.getInfo()) > 0)
				{
					//目标值大于对比值
					this.location = index;
					this.locationNode = currentNode;
				}
				//当前节点赋值给前节点引用
				this.preNode = currentNode;
				//获得当前节点的下一个节点
				currentNode = currentNode.getNext();
				//index递增
				index++;
			}
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
