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
	
	public SecondStepDataEntity getSecondStepDataStringTypeEntity(int selectedType,String filePath,String separator,String testData) {
		SecondStepDataEntity entity = new SecondStepDataEntity();
		entity.setSelectedType(selectedType);
		entity.setFilePath(filePath);
		entity.setSeparator(separator);
		entity.setTestData(testData);
		return entity;
	}
	
	public SecondStepDataEntity getSecondStepDataIntegerTypeEntity(int selectedType,Integer[] dataArray) {
		SecondStepDataEntity entity = new SecondStepDataEntity();
		entity.setSelectedType(selectedType);
		entity.setDataArray(dataArray);
		return entity;
	}
		
	class SecondStepDataEntity{
		private int selectedType;
		private String filePath;
		private String separator;
		private String testData;
		private Integer[] dataArray;
		
		public int getSelectedType() {
			return selectedType;
		}
		public void setSelectedType(int selectedType) {
			this.selectedType = selectedType;
		}
		public String getFilePath() {
			return filePath;
		}
		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}
		public String getSeparator() {
			return separator;
		}
		public void setSeparator(String separator) {
			this.separator = separator;
		}
		public String getTestData() {
			return testData;
		}
		public void setTestData(String testData) {
			this.testData = testData;
		}
		public Integer[] getDataArray() {
			return dataArray;
		}
		public void setDataArray(Integer[] dataArray) {
			this.dataArray = dataArray;
		}
	}

}
