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
	
	public static final Map<String,DataStructureInfoEntity> DATA_STRUCTURE_MAP = new HashMap<String, DataStructureInfoEntity>();
	
	public static final List<String> SELECTED_DATA_STRUCTURE_CODE_LIST = new ArrayList<String>();
	
	public static final Map<String,ResultDataEntity> RESULT_DATA_ENTITY_MAP = new HashMap<String, ResultDataEntity>();
	
	static {
		
		DataStructureInfoEntity dataStructureInfoEntity1 = new DataStructureInfoEntity();
		dataStructureInfoEntity1.setCode(DataStructureCodeEnum.BOUNDED_ORDERED_LIST_BASED_ON_ARRAY.getCode());
		dataStructureInfoEntity1.setDescribe("Bounded ordered list based on array   ");
		dataStructureInfoEntity1.setBigO("O(log2N)");
		dataStructureInfoEntity1.setAnalysisText("AnalysisText O(log2N)");
		
		DataStructureInfoEntity dataStructureInfoEntity2 = new DataStructureInfoEntity();
		dataStructureInfoEntity2.setCode(DataStructureCodeEnum.BOUNDED_UNORDERED_LIST_BASED_ON_ARRAY.getCode());
		dataStructureInfoEntity2.setDescribe("Bounded unordered list based on array             ");
		dataStructureInfoEntity2.setBigO("O(N)");
		dataStructureInfoEntity2.setAnalysisText("AnalysisText O(N)");
		
		DataStructureInfoEntity dataStructureInfoEntity3 = new DataStructureInfoEntity();
		dataStructureInfoEntity3.setCode(DataStructureCodeEnum.UNBOUNDED_ORDERED_LIST_BASED_ON_ARRAY.getCode());
		dataStructureInfoEntity3.setDescribe("Unbounded ordered list based on array             ");
		dataStructureInfoEntity3.setBigO("O(log2N)");
		dataStructureInfoEntity3.setAnalysisText("AnalysisText O(log2N)");
		
		DataStructureInfoEntity dataStructureInfoEntity4 = new DataStructureInfoEntity();
		dataStructureInfoEntity4.setCode(DataStructureCodeEnum.UNBOUNDED_AND_UNORDERED_LIST_BASED_ON_ARRAY.getCode());
		dataStructureInfoEntity4.setDescribe("Unbounded and unordered list based on array       ");
		dataStructureInfoEntity4.setBigO("O(N)");
		dataStructureInfoEntity4.setAnalysisText("AnalysisText O(N)");
		
		DataStructureInfoEntity dataStructureInfoEntity5 = new DataStructureInfoEntity();
		dataStructureInfoEntity5.setCode(DataStructureCodeEnum.BOUNDED_SORTED_LIST_BASED_ON_LINKED_LIST.getCode());
		dataStructureInfoEntity5.setDescribe("Bounded sorted list based on linked list          ");
		dataStructureInfoEntity5.setBigO("O(N)");
		dataStructureInfoEntity5.setAnalysisText("AnalysisText O(N)");
		
		DataStructureInfoEntity dataStructureInfoEntity6 = new DataStructureInfoEntity();
		dataStructureInfoEntity6.setCode(DataStructureCodeEnum.BOUNDED_UNORDERED_LIST_BASED_ON_LINKED_LIST.getCode());
		dataStructureInfoEntity6.setDescribe("Bounded unordered list based on linked list       ");
		dataStructureInfoEntity6.setBigO("O(N)");
		dataStructureInfoEntity6.setAnalysisText("AnalysisText O(N)");
		
		DataStructureInfoEntity dataStructureInfoEntity7 = new DataStructureInfoEntity();
		dataStructureInfoEntity7.setCode(DataStructureCodeEnum.UNBOUNDED_ORDERED_LIST_BASED_ON_LINKED_LIST.getCode());
		dataStructureInfoEntity7.setDescribe("Unbounded ordered list based on linked list       ");
		dataStructureInfoEntity7.setBigO("O(N)");
		dataStructureInfoEntity7.setAnalysisText("AnalysisText O(N)");
		
		DataStructureInfoEntity dataStructureInfoEntity8 = new DataStructureInfoEntity();
		dataStructureInfoEntity8.setCode(DataStructureCodeEnum.UNBOUNDED_AND_UNORDERED_LIST_BASED_ON_LINKED_LIST.getCode());
		dataStructureInfoEntity8.setDescribe("Unbounded and unordered list based on linked list ");
		dataStructureInfoEntity8.setBigO("O(N)");
		dataStructureInfoEntity8.setAnalysisText("AnalysisText O(N)");
		
		DataStructureInfoEntity dataStructureInfoEntity9 = new DataStructureInfoEntity();
		dataStructureInfoEntity9.setCode(DataStructureCodeEnum.BINARY_SEARCH_TREE.getCode());
		dataStructureInfoEntity9.setDescribe("Binary search tree                                ");
		dataStructureInfoEntity9.setBigO("O(log2N)");
		dataStructureInfoEntity9.setAnalysisText("AnalysisText O(log2N)");
		
		
		//Array
		DATA_STRUCTURE_MAP.put(dataStructureInfoEntity1.getCode(), dataStructureInfoEntity1);
		DATA_STRUCTURE_MAP.put(dataStructureInfoEntity2.getCode(), dataStructureInfoEntity2);
		DATA_STRUCTURE_MAP.put(dataStructureInfoEntity3.getCode(), dataStructureInfoEntity3);
		DATA_STRUCTURE_MAP.put(dataStructureInfoEntity4.getCode(), dataStructureInfoEntity4);
		//Linked
		DATA_STRUCTURE_MAP.put(dataStructureInfoEntity5.getCode(), dataStructureInfoEntity5);
		DATA_STRUCTURE_MAP.put(dataStructureInfoEntity6.getCode(), dataStructureInfoEntity6);
		DATA_STRUCTURE_MAP.put(dataStructureInfoEntity7.getCode(), dataStructureInfoEntity7);
		DATA_STRUCTURE_MAP.put(dataStructureInfoEntity8.getCode(), dataStructureInfoEntity8);
		//Tree
		DATA_STRUCTURE_MAP.put(dataStructureInfoEntity9.getCode(), dataStructureInfoEntity9);
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
