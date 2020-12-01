package com.pro.imple;

/**
 * @describe The implements is array-based's unbounded sorted line search list
 * @author Wei Wu 
 */
public class ArrayUnBoundedListSortedLineImpl<T extends Comparable<T>> extends ArrayUnBoundedListSortedImpl<T>{
	
	public ArrayUnBoundedListSortedLineImpl() {
		super();
		//实例化元素数组用默认大小
		this.elements = new Object[INITIAL_CAPACITY];
	}
	
	/**
	 * Get a element data by target element.(The method's complexity is O(N))
	 * @param target
	 * @return target data
	 */
	private void find(T target) {
		//还原found 和 location 变量的 初始值
		this.found = false;
		this.location = 0;
		if(!this.isEmpty()) {
			//列表不为空的情况
			//获取当前元素的数量
			int elementsNum = this.elementsNum;
			//声明并初始化index变量
			int index = 0;
			//循环，过程中对比目标值和对比值
			while(index < elementsNum) {
				int result = target.compareTo((T)this.elements[index]);
				if(result == 0) {
					//两者相等
					this.found = true;
					this.location = index;
				}else if(result > 0) {
					//目标值 大于 对比值
					this.location = index + 1;
				}
				//index变量追加
				index++;
			}
		}
	}

}
