package com.pro.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @describe Static data entity
 * @author Wei Wu
 */
public class StaticDataEntity {
	
	public static final Map<String,String> DATA_STRUCTURE_MAP = new HashMap<String, String>();
	
	public static final List<String> SELECTED_DATA_STRUCTURE_CODE_LIST = new ArrayList<String>();
	
	static {
		//Array
		DATA_STRUCTURE_MAP.put(DataStructureCodeEnum.BOUNDED_ORDERED_LIST_BASED_ON_ARRAY.getCode(), "Bounded ordered list based on array   ");
		DATA_STRUCTURE_MAP.put(DataStructureCodeEnum.BOUNDED_UNORDERED_LIST_BASED_ON_LINKED_LIST.getCode(), "Bounded unordered list based on array             ");
		DATA_STRUCTURE_MAP.put(DataStructureCodeEnum.UNBOUNDED_ORDERED_LIST_BASED_ON_ARRAY.getCode(), "Unbounded ordered list based on array             ");
		DATA_STRUCTURE_MAP.put(DataStructureCodeEnum.UNBOUNDED_AND_UNORDERED_LIST_BASED_ON_ARRAY.getCode(), "Unbounded and unordered list based on array       ");
		//Linked
		DATA_STRUCTURE_MAP.put(DataStructureCodeEnum.BOUNDED_SORTED_LIST_BASED_ON_LINKED_LIST.getCode(), "Bounded sorted list based on linked list          ");
		DATA_STRUCTURE_MAP.put(DataStructureCodeEnum.BOUNDED_UNORDERED_LIST_BASED_ON_LINKED_LIST.getCode(), "Bounded unordered list based on linked list       ");
		DATA_STRUCTURE_MAP.put(DataStructureCodeEnum.UNBOUNDED_ORDERED_LIST_BASED_ON_LINKED_LIST.getCode(), "Unbounded ordered list based on linked list       ");
		DATA_STRUCTURE_MAP.put(DataStructureCodeEnum.UNBOUNDED_AND_UNORDERED_LIST_BASED_ON_LINKED_LIST.getCode(), "Unbounded and unordered list based on linked list ");
		//Tree
		DATA_STRUCTURE_MAP.put(DataStructureCodeEnum.BINARY_SEARCH_TREE.getCode(), "Binary search tree                                ");
	}
	
	public SecondStepDataEntity getSecondStepDataStringTypeEntity(int selectedType,String filePath,String separator,String[] stringDataArr) {
		SecondStepDataEntity entity = new SecondStepDataEntity();
		entity.setSelectedType(selectedType);
		entity.setFilePath(filePath);
		entity.setSeparator(separator);
		entity.setStringDataArr(stringDataArr);
		return entity;
	}
	
	public SecondStepDataEntity getSecondStepDataIntegerTypeEntity(int selectedType,Integer[] dataArray) {
		SecondStepDataEntity entity = new SecondStepDataEntity();
		entity.setSelectedType(selectedType);
		entity.setNumberDataArray(dataArray);
		return entity;
	}

}
